package org.lld.projects.RideSharingApplication.entity;

public class Auto extends Vehicle {

    private static final double FARE_PER_KILOMETER = 12;

    public Auto(String vehicleName, String vehicleNumber) {
        super(vehicleName, vehicleNumber);
        vehicleType = "THREE_WHEELER";
    }

    public Auto(){}

    @Override
    public double calcFareForVehicle(double kilometer) {
        return FARE_PER_KILOMETER * kilometer;
    }

    @Override
    public String getVehicleType() {
        return vehicleType;
    }
}
