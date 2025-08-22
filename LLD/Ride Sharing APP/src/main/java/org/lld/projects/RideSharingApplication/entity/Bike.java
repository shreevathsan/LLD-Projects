package org.lld.projects.RideSharingApplication.entity;

public class Bike extends Vehicle {

    private static final double FARE_PER_KILOMETER = 10;

    public Bike(String vehicleName, String vehicleNumber) {
        super(vehicleName, vehicleNumber);
        vehicleType = "TWO_WHEELER";
    }

    public Bike(){
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
