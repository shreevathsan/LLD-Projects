package org.lld.projects.RideSharingApplication.entity;

public class Car extends Vehicle {

    private static final double FARE_PER_KILOMETER = 15;

    public Car(String vehicleName, String vehicleNumber) {
        super(vehicleName, vehicleNumber);
        vehicleType = "FOUR_WHEELER";
    }

    public Car() {
    }

    @Override
    public double calcFareForVehicle(double kilometer) {
        return FARE_PER_KILOMETER * kilometer;
    }

    @Override
    public String getVehicleType() {
        return vehicleType;
    }
}
