package org.lld.strategy.parkingstrategy;

import org.lld.entity.ParkingFloor;
import org.lld.entity.ParkingSpot;
import org.lld.entity.Vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class LongestParkingSpotStrategy implements ParkingStrategy {
    @Override
    public Optional<ParkingSpot> findSpot(List<ParkingFloor> parkingFloors, Vehicle vehicle) {
        List<ParkingFloor> reversedFloors = new ArrayList<>(parkingFloors);
        Collections.reverse(reversedFloors);
        return reversedFloors.stream().
                flatMap(parkingfloor -> parkingfloor.getParkingSpotMap().values().stream()).
                filter(parkingSpot -> parkingSpot.isSpotAvailable() && parkingSpot.canVehicleParkedInThisSpot(vehicle)).findFirst();
    }
}
