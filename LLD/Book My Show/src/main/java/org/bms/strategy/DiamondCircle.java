package org.bms.strategy;

public class DiamondCircle extends SeatLocation {
    private final double CGST = 9.0;
    private final double SGST = 10.0;
    private final double SEAT_ACTUAL_PRICE = 150;

    @Override
    public double calcPriceForSeat() {
        return SEAT_ACTUAL_PRICE + CGST + SGST;
    }
}
