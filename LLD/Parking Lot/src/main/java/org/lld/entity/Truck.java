package org.lld.entity;

import org.lld.enums.Size;

public class Truck extends Vehicle {

    public Truck(String vehicleName, Size vehicleSize, String vehicleNumber) {
        super(vehicleName, vehicleNumber);
        vehicleSize = Size.LARGE;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public Size getVehicleSize() {
        return vehicleSize;
    }
}
