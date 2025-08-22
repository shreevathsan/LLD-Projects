package org.lld.projects.RideSharingApplication.entity;

public class Passenger extends User {

    private Integer passengerId;

    public Passenger() {
    }

    public Passenger(String name, String email, String phoneNumber, Location location, Integer passengerId) {
        super(name, email, phoneNumber, location);
        this.passengerId = passengerId;
    }

    public Integer getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Integer passengerId) {
        this.passengerId = passengerId;
    }

    public Location getPassengerLocation() {
        return location;
    }

    public String getPassengerName(){
        return name;
    }

    @Override
    public void notify(String message) {
        System.out.println("Passenger Received message: " + message);
    }
}
