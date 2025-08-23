package org.lld.strategy.parkingstrategy;

import org.lld.entity.ParkingFloor;
import org.lld.entity.ParkingSpot;
import org.lld.entity.Vehicle;

import java.util.List;
import java.util.Optional;

public class BestFitForVehicleStrategy implements ParkingStrategy {
    @Override
    public Optional<ParkingSpot> findSpot(List<ParkingFloor> parkingFloors, Vehicle vehicle) {
        Optional<ParkingSpot> bestSpot = Optional.empty();
        for (ParkingFloor parkingFloor : parkingFloors) {

            Optional<ParkingSpot> availableSpot = parkingFloor.findAvailableSpotInTheFloor(vehicle);

            if (availableSpot.isPresent()) {
                if (bestSpot.isEmpty()) {
                    bestSpot = availableSpot;
                } else {
                    if (availableSpot.get().getSpotSize().ordinal() < bestSpot.get().getSpotSize().ordinal()) {
                        bestSpot = availableSpot;
                    }
                }
            }

        }
        return bestSpot;
    }
}
