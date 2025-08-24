package org.bms.entity;

import java.util.Map;
import java.util.stream.Collectors;

public class Show {
    private long startTime;
    private long endTime;
    private Movie movie;
    private Screen screen;

    public Show(long startTime, long endTime, Movie movie, Screen screen) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.movie = movie;
        this.screen = screen;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    /**
     * Method to display available Seat in the screen
     * @return
     */
    public Map<String, Seat> getAvailableSeatForTheShow(){
        return screen.getSeatNoMap().values().stream().filter(Seat::isAvailable).collect(Collectors.toMap(Seat::getSeatNo, seat -> seat));
    }

    @Override
    public String toString() {
        return "Show{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", movie=" + movie +
                ", screen=" + screen +
                '}';
    }
}
