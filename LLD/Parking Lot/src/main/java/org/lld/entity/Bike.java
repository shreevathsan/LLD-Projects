package org.lld.entity;

import org.lld.enums.Size;

public class Bike extends Vehicle {

    public Bike(String vehicleName, Size vehicleSize, String vehicleNumber) {
        super(vehicleName, vehicleNumber);
        vehicleSize = Size.SMALL;
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
