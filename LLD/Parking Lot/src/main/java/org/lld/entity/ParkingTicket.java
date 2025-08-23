package org.lld.entity;

public class ParkingTicket {
    private String refNo;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private long entryTimeStamp;
    private long exitTimeStamp;
    private double bill;

    public ParkingTicket(Vehicle vehicle, ParkingSpot parkingSpot, long entryTimeStamp) {
        this.refNo = java.util.UUID.randomUUID().toString();
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTimeStamp = entryTimeStamp;
    }

    public long getEntryTimeStamp() {
        return entryTimeStamp;
    }

    public void setEntryTimeStamp(long entryTimeStamp) {
        this.entryTimeStamp = entryTimeStamp;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public double getBill() {
        return bill;
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

    public long getExitTimeStamp() {
        return exitTimeStamp;
    }

    public void setExitTimeStamp(long exitTimeStamp) {
        this.exitTimeStamp = exitTimeStamp;
    }

    //Method to trigger notification to the user
    public void triggerParkingDetailsMessage() {
        vehicle.user.notify("Your vehicle got parked in the slot: " + parkingSpot.getSpotName());
    }

    public void triggerParkingChargeMessage() {
        vehicle.user.notify("Your parking charges are: " + bill);
    }

}
