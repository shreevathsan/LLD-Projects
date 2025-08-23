package org.lld.strategy.feestrategy;

import org.lld.entity.ParkingTicket;

public class FlatTicketStrategy implements FeeStrategy {

    private static final double FEE_PER_HOUR = 10.0;

    @Override
    public double calcFee(ParkingTicket ticket) {
        long diff = ticket.getExitTimeStamp() - ticket.getEntryTimeStamp();
        long hours = (diff / (1000 * 60 * 60)) + 1;
        return hours * FEE_PER_HOUR;
    }
}
