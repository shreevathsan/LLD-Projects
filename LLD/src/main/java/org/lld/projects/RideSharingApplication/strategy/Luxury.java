package org.lld.projects.RideSharingApplication.strategy;

public class Luxury implements FareCalculationStrategy {
    private static final double LUXURY_FARE = 5;

    @Override
    public double calcFare(double defaultFare) {
        return LUXURY_FARE + defaultFare;
    }
}
