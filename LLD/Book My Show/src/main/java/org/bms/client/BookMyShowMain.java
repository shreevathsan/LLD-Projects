package org.bms.client;

import org.bms.entity.*;
import org.bms.strategy.DiamondCircle;
import org.bms.strategy.GoldCircle;
import org.bms.strategy.SilverCircle;

import java.util.HashMap;
import java.util.Map;

public class BookMyShowMain {
    public static void main(String[] args) {

        Movie leo = new Movie("Leo", "Vijay", "Trisha", "Lokesh Kanagaraj", "Anirudh");
        Movie viswasam = new Movie("Viswasam", "Ajith", "Nayanthara", "Siva", "Imman");
        Movie goat = new Movie("Goat", "Vijay", "Sneha", "Venkat Prabhu", "Yuvan");

        Map<String, Seat> rajendraSeatMap = new HashMap<>() {{
            put("A1", new Seat("A1", true, new SilverCircle()));
            put("A2", new Seat("A2", true, new SilverCircle()));
            put("A3", new Seat("A3", true, new SilverCircle()));

            put("B1", new Seat("B1", true, new GoldCircle()));
            put("B2", new Seat("B2", true, new GoldCircle()));
            put("B3", new Seat("B3", true, new GoldCircle()));

            put("C1", new Seat("C1", true, new DiamondCircle()));
            put("C2", new Seat("C2", true, new DiamondCircle()));
            put("C3", new Seat("C3", true, new DiamondCircle()));

            put("D1", new Seat("D1", true, new DiamondCircle()));
            put("D2", new Seat("D2", true, new DiamondCircle()));
            put("D3", new Seat("D3", true, new DiamondCircle()));
        }};

        Map<String, Seat> umaSeatMap = new HashMap<>() {{
            put("A1", new Seat("A1", true, new SilverCircle()));
            put("A2", new Seat("A2", true, new SilverCircle()));
            put("A3", new Seat("A3", true, new SilverCircle()));

            put("B1", new Seat("B1", true, new GoldCircle()));
            put("B2", new Seat("B2", true, new GoldCircle()));
            put("B3", new Seat("B3", true, new GoldCircle()));

            put("C1", new Seat("C1", true, new DiamondCircle()));
            put("C2", new Seat("C2", true, new DiamondCircle()));
            put("C3", new Seat("C3", true, new DiamondCircle()));

            put("D1", new Seat("D1", true, new DiamondCircle()));
            put("D2", new Seat("D2", true, new DiamondCircle()));
            put("D3", new Seat("D3", true, new DiamondCircle()));
        }};

        Map<String, Seat> rambaSeatMap = new HashMap<>() {{
            put("A1", new Seat("A1", true, new SilverCircle()));
            put("A2", new Seat("A2", true, new SilverCircle()));
            put("A3", new Seat("A3", true, new SilverCircle()));

            put("B1", new Seat("B1", true, new GoldCircle()));
            put("B2", new Seat("B2", true, new GoldCircle()));
            put("B3", new Seat("B3", true, new GoldCircle()));

            put("C1", new Seat("C1", true, new DiamondCircle()));
            put("C2", new Seat("C2", true, new DiamondCircle()));
            put("C3", new Seat("C3", true, new DiamondCircle()));

            put("D1", new Seat("D1", true, new DiamondCircle()));
            put("D2", new Seat("D2", true, new DiamondCircle()));
            put("D3", new Seat("D3", true, new DiamondCircle()));
        }};

        Screen rajendra = new Screen("shower", rajendraSeatMap);
        Screen uma = new Screen("shower", umaSeatMap);
        Screen ramba = new Screen("shower", rambaSeatMap);


        Map<Long, Show> rajendraShowMap = new HashMap<>() {{
            put(1L, new Show(1L, 2L, leo, rajendra));
            put(2L, new Show(3L, 4L, viswasam, rajendra));
            put(3L, new Show(5L, 6L, goat, rajendra));
        }};

        Theatre umaRajendraMultiplex = new Theatre("UmaRajendra-Multiplex", rajendraShowMap);

        City city = new City("Dindigul", new HashMap<>() {{
            put("UmaRajendra-Multiplex", umaRajendraMultiplex);
        }});


    }
}
