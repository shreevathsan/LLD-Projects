package org.lld.entity;

import org.lld.enums.Size;

public class Car extends Vehicle {

    public Car(String vehicleName, Size vehicleSize, String vehicleNumber) {
        super(vehicleName, vehicleNumber);
        vehicleSize = Size.MEDIUM;
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
