package org.bms.service;

import org.bms.entity.*;

import java.util.Map;
import java.util.stream.Collectors;

public class SimpleQueryService {

    private static SimpleQueryService instance;

    private SimpleQueryService() {
    }

    public static final SimpleQueryService getInstance() {
        if (null == instance) {
            synchronized (SimpleQueryService.class) {
                if (null == instance) {
                    instance = new SimpleQueryService();
                }
            }
        }
        return instance;
    }

    public void printTheatreForRequestMovie(City city, Movie movie) {
        Map<String, Theatre> map = city.getTheatreForTheRequestedMovie(movie);
        if (null == map || map.isEmpty()) {
            System.out.println("No theatre available for the request movie");
        } else {
            System.out.println("Available theatre for the request movie are: " + map.values().stream().map(Theatre::getTheatreName).collect(Collectors.toList()));
        }
    }

    public void printShowsForTheRequestMovieAndTheatre(Theatre theatre, Movie movie, long startTime, long endTime) {
        Map<Long, Show> map = theatre.getShowForTheRequestedMovie(movie, startTime, endTime);
        if (null == map || map.isEmpty()) {
            System.out.println("No show available for the movie");
        } else {
            System.out.println("Available show for the request movie are: " + map.values().stream().collect(Collectors.toList()));
        }
    }

    public void printAvailableSeatsForTheShow(Show show) {
        Map<String, Seat> map = show.getAvailableSeatForTheShow();
        if (null == map || map.isEmpty()) {
            System.out.println("Oops !! no seats available for the current selected show");
        } else {
            System.out.println("Available seats for the current selected show are: " + map.values().stream().collect(Collectors.toList()));
        }
    }
}
