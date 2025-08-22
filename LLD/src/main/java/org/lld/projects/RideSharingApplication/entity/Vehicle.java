package org.lld.projects.RideSharingApplication.entity;

public abstract class Vehicle {
    protected String vehicleName;
    protected String vehicleNumber;
    protected String vehicleType;

    public Vehicle(String vehicleName, String vehicleNumber) {
        this.vehicleName = vehicleName;
        this.vehicleNumber = vehicleNumber;
    }

    public Vehicle(){}

    public abstract double calcFareForVehicle(double kilometer);

    public abstract String getVehicleType();

}
