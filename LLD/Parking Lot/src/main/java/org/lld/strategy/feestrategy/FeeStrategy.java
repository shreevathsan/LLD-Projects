package org.lld.strategy.feestrategy;

import org.lld.entity.ParkingTicket;

public interface FeeStrategy {
    public double calcFee(ParkingTicket ticket);
}
