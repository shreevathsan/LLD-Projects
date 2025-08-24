package org.bms.entity;

import java.util.Map;

public class Screen {
    private String name;
    private Map<String, Seat> seatNoMap;


    public Screen(String name, Map<String, Seat> seatNoToSeatMap) {
        this.name = name;
        this.seatNoMap = seatNoToSeatMap;
    }

    public Screen() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Seat> getSeatNoMap() {
        return seatNoMap;
    }

    public void setSeatNoMap(Map<String, Seat> seatNoMap) {
        this.seatNoMap = seatNoMap;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "name='" + name + '\'' +
                ", seatNoMap=" + seatNoMap +
                '}';
    }
}
