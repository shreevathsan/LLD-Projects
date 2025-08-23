package org.lld.entity;

import org.lld.enums.Size;

public abstract class Vehicle {

    protected String vehicleName;
    protected String vehicleNumber;
    protected Size vehicleSize;
    protected User user;

    public Vehicle(String vehicleName, String vehicleNumber, User user) {
        this.vehicleName = vehicleName;
        this.vehicleNumber = vehicleNumber;
        this.user = user;
    }

    public abstract String getVehicleNumber();

    public abstract String getVehicleName();

    public abstract Size getVehicleSize();
}
