package org.lld.service;

import org.lld.entity.*;
import org.lld.strategy.feestrategy.FeeStrategy;
import org.lld.strategy.parkingstrategy.ParkingStrategy;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class ParkingLot {
    private static ParkingLot instance;
    private ParkingFloor parkingFloor;
    private final Map<String, ParkingTicket> vehicleNumberToParkingTicketMap = new ConcurrentHashMap<>();

    private ParkingLot() {
    }

    //Try to return the Ticket from here and so that we can play with this instance outside the class as well
    public synchronized void parkVehicle(Vehicle vehicle, List<ParkingFloor> parkingFloors, ParkingStrategy parkingStrategy) {
        Optional<ParkingSpot> parkingSpotOptional = parkingStrategy.findSpot(parkingFloors, vehicle);
        if (!parkingSpotOptional.isPresent()) {
            System.out.println("No parking slots available currently");
            return;
        }
        ParkingSpot parkingSpot = parkingSpotOptional.get();
        parkingSpot.setParkedVehicle(vehicle);
        parkingSpot.setSpotAvailable(false);

        //Form a Ticket
        ParkingTicket parkingTicket = new ParkingTicket(vehicle, parkingSpot, System.currentTimeMillis());
        vehicleNumberToParkingTicketMap.put(vehicle.getVehicleNumber(), parkingTicket);

        //Notify the users
        parkingTicket.triggerParkingDetailsMessage();
    }

    //Try to return the Ticket from here and so that we can play with this instance outside the class as well
    public synchronized void unparkVehicle(String vehicleNumber, FeeStrategy feeStrategy) {
        ParkingTicket parkingTicket = vehicleNumberToParkingTicketMap.get(vehicleNumber);
        if (parkingTicket == null) {
            System.out.println("Vehicle not parked !!");
            return;
        }
        ParkingSpot parkedSpot = parkingTicket.getParkingSpot();
        parkedSpot.setSpotAvailable(true);
        vehicleNumberToParkingTicketMap.remove(vehicleNumber);

        parkingTicket.setExitTimeStamp(System.currentTimeMillis());
        double fee = feeStrategy.calcFee(parkingTicket);
        parkingTicket.setBill(fee);

        //Notify User
        parkingTicket.triggerParkingChargeMessage();
    }

    public static ParkingLot getInstance() {
        if (instance == null) {
            synchronized (ParkingLot.class) {
                if (instance == null) {
                    instance = new ParkingLot();
                }
            }
        }
        return instance;
    }
}
