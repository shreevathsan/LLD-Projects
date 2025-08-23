package org.lld.strategy.feestrategy;

import org.lld.entity.ParkingTicket;
import org.lld.enums.Size;

import java.util.Map;

public class FeePerVehicleStrategy implements FeeStrategy {

    Map<Size, Double> feePerVehicleMap = Map.of(Size.SMALL, 10.0, Size.MEDIUM, 15.0, Size.LARGE, 20.0);

    @Override
    public double calcFee(ParkingTicket ticket) {
        long diff = ticket.getExitTimeStamp() - ticket.getEntryTimeStamp();
        long hours = (diff / (1000 * 60 * 60)) + 1;
        return hours * (feePerVehicleMap.get(ticket.getVehicle().getVehicleSize()));
    }
}
