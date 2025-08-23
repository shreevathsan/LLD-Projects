package org.lld.entity;

import org.lld.enums.Size;

public class Car extends Vehicle {

    public Car(String vehicleName, String vehicleNumber, User user) {
        super(vehicleName, vehicleNumber, user);
        vehicleSize = Size.MEDIUM;
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
