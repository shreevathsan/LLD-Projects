package org.lld.entity;

import org.lld.service.NotificationService;

public class ParkingTicket {
    private String refNo;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private User parkedUser;
    private long entryTimeStamp;
    private long exitTimeStamp;
    private NotificationService notificationService;

    public ParkingTicket(String refNo, Vehicle vehicle, ParkingSpot parkingSpot, User parkedUser, long entryTimeStamp, long exitTimeStamp) {
        this.refNo = refNo;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.parkedUser = parkedUser;
        this.entryTimeStamp = entryTimeStamp;
        this.exitTimeStamp = exitTimeStamp;
        this.notificationService = new NotificationService();
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public User getParkedUser() {
        return parkedUser;
    }

    public void setParkedUser(User parkedUser) {
        this.parkedUser = parkedUser;
    }

    public long getEntryTimeStamp() {
        return entryTimeStamp;
    }

    public void setEntryTimeStamp(long entryTimeStamp) {
        this.entryTimeStamp = entryTimeStamp;
    }

    public long getExitTimeStamp() {
        return exitTimeStamp;
    }

    public void setExitTimeStamp(long exitTimeStamp) {
        this.exitTimeStamp = exitTimeStamp;
    }

    //Method related to our system

}
