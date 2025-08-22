package org.lld.projects.RideSharingApplication.service;

import org.lld.projects.RideSharingApplication.entity.*;
import org.lld.projects.RideSharingApplication.strategy.FareCalculationStrategy;

import java.util.ArrayList;
import java.util.List;

public class RideMatchingService {

    List<Driver> drivers = new ArrayList<>();

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public void matchPassengerWithNearestDriver(Passenger passenger, String vehicleTypeRequest, FareCalculationStrategy fareCalculationStrategy, double km) {
        Driver minDistDriver = getNearestDriver(passenger, vehicleTypeRequest);
        if (minDistDriver == null) {
            System.out.println("No drivers are currently available to pick");
            passenger.notify("No drivers are currently available to pick");
            return;
        }
        double fare = calcFareForRide(minDistDriver.getVehicle(), fareCalculationStrategy, km);
        drivers.remove(minDistDriver);
        Ride ride = new Ride(minDistDriver, passenger, fare, STATUS.PENDING);
        ride.startRide();
        ride.endRide();
        // drivers.add(minDistDriver);
    }

    private Driver getNearestDriver(Passenger passenger, String vehicleTypeRequest) {
        double minDist = Double.MAX_VALUE;
        Driver minDistDriver = null;
        for (Driver driver : drivers) {
            if (vehicleTypeRequest.equalsIgnoreCase(driver.getVehicle().getVehicleType())) {
                double currDist = driver.getDriverLocation().calcDistance(passenger.getPassengerLocation());
                if (currDist < minDist) {
                    minDist = currDist;
                    minDistDriver = driver;
                }
            }

        }
        return minDistDriver;
    }

    private double calcFareForRide(Vehicle vehicle, FareCalculationStrategy fareCalculationStrategy, double km) {
        return fareCalculationStrategy.calcFare(vehicle.calcFareForVehicle(km));
    }

}
