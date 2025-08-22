package org.lld.projects.RideSharingApplication.entity;

public class Location {
    private double latitude;
    private double longitude;

    public Location() {
    }

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * Method to calculate the distance with the help of Euclidean Formula
     *
     * @param loc
     * @return
     */
    public double calcDistance(Location loc) {
        double latDiff = this.latitude - loc.latitude;
        double lonDiff = this.longitude - loc.longitude;
        return Math.sqrt(latDiff * latDiff + lonDiff * lonDiff);
    }

}
