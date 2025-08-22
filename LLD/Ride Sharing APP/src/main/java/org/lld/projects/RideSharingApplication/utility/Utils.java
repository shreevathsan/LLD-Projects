package org.lld.projects.RideSharingApplication.utility;

import org.lld.projects.RideSharingApplication.entity.*;

import java.util.Arrays;
import java.util.List;

public class Utils {

    public static List<Driver> getSystemDriverList() {
        Driver alice = new Driver("Alice", "alice@gmail.com", "8072205910", new Location(90, 90), new Bike("Passion Pro", "TN75BC5935"), 1, true);
        Driver bob = new Driver("Bob", "bob@gmail.com", "8072205910", new Location(89.66, 12.88), new Car("Alto", "TN75BC5935"), 2, true);
        Driver david = new Driver("David", "david@gmail.com", "8072205910", new Location(70.45, 90), new Auto("Mahindra", "TN75BC5935"), 3, true);
        Driver rahul = new Driver("Rahul", "Rahul@gmail.com", "8072205910", new Location(89, 12.55), new Bike("Passion Pro", "TN75BC5935"), 4, true);
        Driver sachin = new Driver("Sachin", "Sachin@gmail.com", "8072205910", new Location(47.99, 34.88), new Car("Alto", "TN75BC5935"), 5, true);
        Driver prem = new Driver("Prem", "Prem@gmail.com", "8072205910", new Location(89.99, 71.46), new Auto("Mahindra", "TN75BC5935"), 6, true);
        return Arrays.asList(alice, bob, david, rahul, sachin, prem);
    }
}
