package org.lld.projects.RideSharingApplication.entity;

public class Driver extends User {
    private Vehicle vehicle;
    private Integer driverId;
    private boolean isAvailableNow;

    public Driver() {
    }

    public Location getDriverLocation() {
        return location;
    }

    public Driver(String name, String email, String phoneNumber, Location location, Vehicle vehicle, Integer driverId, boolean isAvailableNow) {
        super(name, email, phoneNumber, location);
        this.vehicle = vehicle;
        this.driverId = driverId;
        this.isAvailableNow = isAvailableNow;
    }

    public String getDriverName(){
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public boolean isAvailableNow() {
        return isAvailableNow;
    }

    public void setAvailableNow(boolean availableNow) {
        isAvailableNow = availableNow;
    }

    @Override
    public void notify(String message) {
        System.out.println("Driver Received message: " + message);
    }



}
