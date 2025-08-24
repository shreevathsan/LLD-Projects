package org.bms.entity;

import org.bms.strategy.SeatLocation;

public class Seat {
    private String seatNo;
    private boolean isAvailable;
    private SeatLocation seatLocation;

    public Seat() {
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Seat(String seatNo, boolean isAvailable, SeatLocation seatLocation) {
        this.seatNo = seatNo;
        this.isAvailable = isAvailable;
        this.seatLocation = seatLocation;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public SeatLocation getSeatLocation() {
        return seatLocation;
    }

    public void setSeatLocation(SeatLocation seatLocation) {
        this.seatLocation = seatLocation;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatNo='" + seatNo + '\'' +
                ", isAvailable=" + isAvailable +
                ", seatLocation=" + seatLocation +
                '}';
    }
}
