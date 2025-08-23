package org.lld.entity;

import org.lld.enums.Size;

public class ParkingSpot {

    private String spotName;
    private boolean isSpotAvailable;
    private Vehicle parkedVehicle;
    private Size spotSize;

    public ParkingSpot() {
    }

    public ParkingSpot(String spotName, boolean isSpotAvailable, Vehicle parkedVehicle, Size spotSize) {
        this.spotName = spotName;
        this.isSpotAvailable = isSpotAvailable;
        this.parkedVehicle = parkedVehicle;
        this.spotSize = spotSize;
    }

    public String getSpotName() {
        return spotName;
    }

    public void setSpotName(String spotName) {
        this.spotName = spotName;
    }

    public Size getSpotSize() {
        return spotSize;
    }

    public void setSpotSize(Size spotSize) {
        this.spotSize = spotSize;
    }

    public boolean isSpotAvailable() {
        return isSpotAvailable;
    }

    public void setSpotAvailable(boolean spotAvailable) {
        isSpotAvailable = spotAvailable;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public void setParkedVehicle(Vehicle parkedVehicle) {
        this.parkedVehicle = parkedVehicle;
    }

    public boolean isSpotBestFitForVehicle(Vehicle vehicle) {
        return this.spotSize.equals(vehicle.vehicleSize);
    }

    public boolean canVehicleParkedInThisSpot(Vehicle vehicle) {
        return this.spotSize.ordinal() >= vehicle.getVehicleSize().ordinal();
    }
}
