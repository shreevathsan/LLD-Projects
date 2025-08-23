package org.lld.entity;

import org.lld.enums.Size;

public abstract class Vehicle {

    protected String vehicleName;
    protected String vehicleNumber;
    protected Size vehicleSize;

    public Vehicle(String vehicleName, String vehicleNumber) {
        this.vehicleName = vehicleName;
        this.vehicleNumber = vehicleNumber;
    }

    public abstract String getVehicleName();

    public abstract Size getVehicleSize();
}
