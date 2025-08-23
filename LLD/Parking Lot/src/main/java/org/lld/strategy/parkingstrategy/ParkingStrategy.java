package org.lld.strategy.parkingstrategy;

import org.lld.entity.ParkingFloor;
import org.lld.entity.ParkingSpot;
import org.lld.entity.Vehicle;

import java.util.List;
import java.util.Optional;

public interface ParkingStrategy {

    public Optional<ParkingSpot> findSpot(List<ParkingFloor> parkingFloors, Vehicle vehicle);
}
