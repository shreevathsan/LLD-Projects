package org.lld.projects.RideSharingApplication.entity;


import org.lld.projects.RideSharingApplication.service.NotificationService;

public class Ride {
    private Driver driver;
    private Passenger passenger;
    private double fare;
    private STATUS status;
    private NotificationService notificationService;

    public Ride(Driver driver, Passenger passenger, double fare, STATUS status) {
        this.driver = driver;
        this.passenger = passenger;
        this.fare = fare;
        this.status = status;
        notificationService = new NotificationService();
        notificationService.notifyUsersWithPendingStatus(this.passenger, this.driver, this.fare, this.status);
    }

    public void startRide() {
        if (status != STATUS.PENDING) {
            throw new IllegalArgumentException("Status Mismatched");
        }
        status = STATUS.ONGOING;
        notificationService.notifyUsersWithOnGoingStatus(passenger, driver, fare, status);
    }

    public void endRide() {
        if (status != STATUS.ONGOING) {
            throw new IllegalArgumentException("Status Mismatched");
        }
        status = STATUS.COMPLETED;
        notificationService.notifyUsersWithCompletedStatus(passenger, driver, fare, status);
    }


}
