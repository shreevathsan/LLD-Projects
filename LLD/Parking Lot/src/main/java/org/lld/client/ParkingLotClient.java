package org.lld.client;

import org.lld.entity.*;
import org.lld.enums.Size;
import org.lld.service.ParkingLot;
import org.lld.strategy.feestrategy.FeePerVehicleStrategy;
import org.lld.strategy.feestrategy.FlatTicketStrategy;
import org.lld.strategy.parkingstrategy.BestFitForVehicleStrategy;
import org.lld.strategy.parkingstrategy.LongestParkingSpotStrategy;
import org.lld.strategy.parkingstrategy.NearestParkingSpotStrategy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLotClient {
    public static void main(String[] args) {

        User shreevathsan = new User("Shreevathsan", "shree@gmail.com", "8072205911");
        User devishree = new User("devishree", "devi@gmail.com", "8072205912");
        User leoDas = new User("leo", "leo@gmail.com", "8072205913");

        // Floor 1 Parking spots
        Map<String, ParkingSpot> floor1Spots = new HashMap<>();
        floor1Spots.put("F1-S1", new ParkingSpot("F1-S1", true, null, Size.SMALL));
        floor1Spots.put("F1-S2", new ParkingSpot("F1-S2", true, null, Size.MEDIUM));
        floor1Spots.put("F1-S3", new ParkingSpot("F1-S3", true, null, Size.LARGE));
        floor1Spots.put("F1-S4", new ParkingSpot("F1-S4", true, null, Size.SMALL));
        floor1Spots.put("F1-S5", new ParkingSpot("F1-S5", true, null, Size.MEDIUM));
        floor1Spots.put("F1-S6", new ParkingSpot("F1-S6", true, null, Size.LARGE));

        // Floor 2 Parking spots
        Map<String, ParkingSpot> floor2Spots = new HashMap<>();
        floor2Spots.put("F2-S1", new ParkingSpot("F2-S1", true, null, Size.SMALL));
        floor2Spots.put("F2-S2", new ParkingSpot("F2-S2", true, null, Size.MEDIUM));
        floor2Spots.put("F2-S3", new ParkingSpot("F2-S3", true, null, Size.LARGE));
        floor2Spots.put("F2-S4", new ParkingSpot("F2-S4", true, null, Size.SMALL));
        floor2Spots.put("F2-S5", new ParkingSpot("F2-S5", true, null, Size.MEDIUM));
        floor2Spots.put("F2-S6", new ParkingSpot("F2-S6", true, null, Size.LARGE));

        // Floor 3 Parking spots
        Map<String, ParkingSpot> floor3Spots = new HashMap<>();
        floor3Spots.put("F3-S1", new ParkingSpot("F3-S1", true, null, Size.SMALL));
        floor3Spots.put("F3-S2", new ParkingSpot("F3-S2", true, null, Size.MEDIUM));
        floor3Spots.put("F3-S3", new ParkingSpot("F3-S3", true, null, Size.LARGE));
        floor3Spots.put("F3-S4", new ParkingSpot("F3-S4", true, null, Size.SMALL));
        floor3Spots.put("F3-S5", new ParkingSpot("F3-S5", true, null, Size.MEDIUM));
        floor3Spots.put("F3-S6", new ParkingSpot("F3-S6", true, null, Size.LARGE));


        ParkingFloor floorOne = new ParkingFloor("F1", floor1Spots);
        ParkingFloor floorTwo = new ParkingFloor("F2", floor2Spots);
        ParkingFloor floorThree = new ParkingFloor("F3", floor3Spots);

        List<ParkingFloor> parkingFloors = Arrays.asList(floorOne, floorTwo, floorThree);

        Vehicle bike = new Bike("Passion", "TN57BC5935", shreevathsan);
        Vehicle car = new Car("Alto", "TN57BC5934", devishree);
        Vehicle truck = new Truck("Ace", "TN57BC5939", leoDas);


        //PARK and UNPARK Vehicle
        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.parkVehicle(bike, parkingFloors, new BestFitForVehicleStrategy());
        parkingLot.unparkVehicle("TN57BC5935", new FeePerVehicleStrategy());
        System.out.println("----------------------");
        parkingLot.parkVehicle(car, parkingFloors, new NearestParkingSpotStrategy());
        parkingLot.unparkVehicle("TN57BC5934", new FlatTicketStrategy());
        System.out.println("----------------------");
        parkingLot.parkVehicle(truck, parkingFloors, new LongestParkingSpotStrategy());
        parkingLot.unparkVehicle("TN57BC5939", new FeePerVehicleStrategy());


    }
}
