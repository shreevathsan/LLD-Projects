package org.lld.projects.RideSharingApplication.client;

import org.lld.projects.RideSharingApplication.entity.*;
import org.lld.projects.RideSharingApplication.service.RideMatchingService;
import org.lld.projects.RideSharingApplication.strategy.Luxury;
import org.lld.projects.RideSharingApplication.strategy.Shared;
import org.lld.projects.RideSharingApplication.strategy.Standard;

public class RideSharingAppMain {
    public static void main(String[] args) {
        RideMatchingService rideMatchingService = new RideMatchingService();

        Driver alice = new Driver("Alice", "alice@gmail.com", "8072205910", new Location(90, 90), new Bike("Passion Pro", "TN75BC5935"), 1, true);
        Driver bob = new Driver("Bob", "bob@gmail.com", "8072205910", new Location(89.66, 12.88), new Car("Alto", "TN75BC5935"), 2, true);
        Driver david = new Driver("David", "david@gmail.com", "8072205910", new Location(70.45, 90), new Auto("Mahindra", "TN75BC5935"), 3, true);
        Driver rahul = new Driver("Rahul", "Rahul@gmail.com", "8072205910", new Location(89, 12.55), new Bike("Passion Pro", "TN75BC5935"), 4, true);
        Driver sachin = new Driver("Sachin", "Sachin@gmail.com", "8072205910", new Location(47.99, 34.88), new Car("Alto", "TN75BC5935"), 5, true);
        Driver prem = new Driver("Prem", "Prem@gmail.com", "8072205910", new Location(89.99, 71.46), new Auto("Mahindra", "TN75BC5935"), 6, true);

        rideMatchingService.addDriver(alice);
        rideMatchingService.addDriver(bob);
        rideMatchingService.addDriver(david);
        rideMatchingService.addDriver(rahul);
        rideMatchingService.addDriver(sachin);
        rideMatchingService.addDriver(prem);

        Passenger dinesh = new Passenger("Dinesh", "din@gmail.com", "8072205910", new Location(90, 90), 1);
        rideMatchingService.matchPassengerWithNearestDriver(dinesh,"TWO_WHEELER", new Shared(), 1);

        System.out.println("----------------------------");

        Passenger divakar = new Passenger("Divakar", "diva@gmail.com", "8072205910", new Location(12, 10.0), 1);
        rideMatchingService.matchPassengerWithNearestDriver(divakar, "TWO_WHEELER", new Standard(), 1);

        System.out.println("----------------------------");

        Passenger vimal = new Passenger("Vimal", "vimal@gmail.com", "8072205910", new Location(12, 10.0), 1);
        rideMatchingService.matchPassengerWithNearestDriver(vimal, "TWO_WHEELER", new Luxury(), 1);

    }
}
