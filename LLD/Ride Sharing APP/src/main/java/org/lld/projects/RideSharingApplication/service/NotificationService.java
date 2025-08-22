package org.lld.projects.RideSharingApplication.service;

import org.lld.projects.RideSharingApplication.entity.Driver;
import org.lld.projects.RideSharingApplication.entity.Passenger;
import org.lld.projects.RideSharingApplication.entity.STATUS;

/**
 * This is something like Observer pattern where the passenger and the drivers are
 * the oberservers of the system
 *
 */
public class NotificationService {

    public void notifyUsersWithPendingStatus(Passenger passenger, Driver driver, double fare, STATUS status) {
        passenger.notify("Your ride has been confirmed with: " + driver.getDriverName() + " with a fare of :" + fare + " and current status is :" + status);
        driver.notify("You have new booking for the passenger: " + passenger.getPassengerName() + " with a fare of: " + fare);
    }

    public void notifyUsersWithOnGoingStatus(Passenger passenger, Driver driver, double fare, STATUS status) {
        passenger.notify("Your ride started with: " + driver.getDriverName() + " with a fare of :" + fare + " and current status is :" + status);
        driver.notify("Your ride started with the passenger: " + passenger.getPassengerName() + " with a fare of: " + fare + " and current status is :" + status);
    }

    public void notifyUsersWithCompletedStatus(Passenger passenger, Driver driver, double fare, STATUS status) {
        passenger.notify("Your ride completed with: " + driver.getDriverName() + " with a fare of :" + fare + " and current status is :" + status);
        driver.notify("Your ride completed with the passenger: " + passenger.getPassengerName() + " with a fare of: " + fare + " and current status is :" + status);
    }
}
