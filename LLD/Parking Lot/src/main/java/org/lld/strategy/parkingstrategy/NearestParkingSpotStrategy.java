package org.lld.strategy.parkingstrategy;

import org.lld.entity.ParkingFloor;
import org.lld.entity.ParkingSpot;
import org.lld.entity.Vehicle;

import java.util.List;
import java.util.Optional;

public class NearestParkingSpotStrategy implements ParkingStrategy {
    @Override
    public Optional<ParkingSpot> findSpot(List<ParkingFloor> parkingFloors, Vehicle vehicle) {
        return parkingFloors.stream().
                flatMap(parkingfloor -> parkingfloor.getParkingSpotMap().values().stream()).
                filter(parkingSpot -> parkingSpot.isSpotAvailable() && parkingSpot.canVehicleParkedInThisSpot(vehicle)).findFirst();
    }
}
