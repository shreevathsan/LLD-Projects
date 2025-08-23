package org.lld.entity;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;

public class ParkingFloor {

    private String floorName;

    private Map<String, ParkingSpot> parkingSpotMap;

    public ParkingFloor(String floorName, Map<String, ParkingSpot> parkingSpotMap) {
        this.floorName = floorName;
        this.parkingSpotMap = parkingSpotMap;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public Map<String, ParkingSpot> getParkingSpotMap() {
        return parkingSpotMap;
    }

    public void setParkingSpotMap(Map<String, ParkingSpot> parkingSpotMap) {
        this.parkingSpotMap = parkingSpotMap;
    }

    //There should be method to find the best available spot by sorting

    public synchronized Optional<ParkingSpot> findAvailableSpotInTheFloor(Vehicle vehicle) {
        return parkingSpotMap.values().stream().filter(spot -> spot.isSpotAvailable() && spot.canVehicleParkedInThisSpot(vehicle)).min(Comparator.comparing(ParkingSpot::getSpotSize));
    }

}
