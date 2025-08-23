package org.lld.entity;

import org.lld.enums.Size;

public class Truck extends Vehicle {

    public Truck(String vehicleName, String vehicleNumber, User user) {
        super(vehicleName, vehicleNumber, user);
        vehicleSize = Size.LARGE;
    }

    @Override
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public Size getVehicleSize() {
        return vehicleSize;
    }
}
