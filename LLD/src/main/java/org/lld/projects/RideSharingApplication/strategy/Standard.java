package org.lld.projects.RideSharingApplication.strategy;

public class Standard implements FareCalculationStrategy {

    private static final double STANDARD_FARE = 10;

    @Override
    public double calcFare(double defaultFare) {
        return STANDARD_FARE + defaultFare;
    }
}
