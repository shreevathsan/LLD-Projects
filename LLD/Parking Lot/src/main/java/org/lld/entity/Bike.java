package org.lld.entity;

import org.lld.enums.Size;

public class Bike extends Vehicle {

    public Bike(String vehicleName, String vehicleNumber, User user) {
        super(vehicleName, vehicleNumber, user);
        vehicleSize = Size.SMALL;
    }

    @Override
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    @Override
    public String getVehicleName() {
        return vehicleName;
    }

    @Override
    public Size getVehicleSize() {
        return vehicleSize;
    }
}
