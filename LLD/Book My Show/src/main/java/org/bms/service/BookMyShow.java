package org.bms.service;

import org.bms.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BookMyShow {

    private List<City> cities = new ArrayList<>();

    private static BookMyShow instance;

    private static final Map<String, MovieTicket> movieTicketMap = new ConcurrentHashMap<>(); // Helps to track while cancellation

    private BookMyShow() {
    }


    public MovieTicket bookTicket(User user, Show show, List<Seat> seats, City city, Theatre theatre) {
        // Block the seat for the current booking user & we are assuming the instance of the List<Seat> and the Seat present in the Show are same
        if (seats.stream().anyMatch(seat -> !seat.isAvailable())) {
            System.out.println("Selected seat is currently unavailable");
            return null;
        }
        synchronized (Show.class) {
            seats.forEach(seat -> seat.setAvailable(false));
        }

        //calculate ticket price
        double amount = 0;
        for (Seat seat : seats) {
            amount = amount + seat.getSeatLocation().calcPriceForSeat();
        }

        MovieTicket movieTicket = new MovieTicket(city, theatre, show, amount, seats, user);
        movieTicket.notifyUserWithMovieTicket();
        movieTicketMap.put(movieTicket.getRefNo(), movieTicket);
        return movieTicket;
    }


    public void cancelTicket(MovieTicket movieTicket, User user) {
        System.out.println("Movie Ticket cancellation started for the user: " + user.getUserName());

        MovieTicket ticket = movieTicketMap.get(movieTicket.getRefNo());
        if (null == ticket) {
            System.out.println("Invalid Movie ticket");
            return;
        }
        ticket.getSeats().forEach(seat -> seat.setAvailable(true));
        movieTicketMap.remove(ticket.getRefNo());
    }


    // Singleton instantiation
    public static BookMyShow getInstance() {
        if (null == instance) {
            synchronized (BookMyShow.class) {
                if (null == instance) {
                    instance = new BookMyShow();
                }
            }
        }
        return instance;
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public List<City> getCities() {
        return cities;
    }

    public void printTheatreListForCity(City city) {
        System.out.println("Theatre present in the city :" + city.getCityName() + " are: " + city.getTheatreMap());
    }

}
