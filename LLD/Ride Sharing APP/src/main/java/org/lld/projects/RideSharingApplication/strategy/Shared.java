package org.lld.projects.RideSharingApplication.strategy;

public class Shared implements FareCalculationStrategy {
    private static final double SHARED_FARE = 5;

    @Override
    public double calcFare(double defaultFare) {
        return SHARED_FARE + defaultFare;
    }
}
