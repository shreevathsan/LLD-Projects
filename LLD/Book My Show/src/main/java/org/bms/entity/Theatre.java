package org.bms.entity;

import java.util.Map;
import java.util.stream.Collectors;

public class Theatre {
    private String theatreName;
    private Map<Long, Show> showMap;

    public Theatre(String theatreName, Map<Long, Show> showMap) {
        this.theatreName = theatreName;
        this.showMap = showMap;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public Map<Long, Show> getShowMap() {
        return showMap;
    }

    public void setScreenNameMap(Map<Long, Show> showMap) {
        this.showMap = showMap;
    }

    /**
     * Method to display the available shows for the requested movie
     *
     * @param movie
     * @param startTime
     * @param endTime
     * @return
     */
    public Map<Long, Show> getShowForTheRequestedMovie(Movie movie, long startTime, long endTime) {
        return showMap.values().stream().filter(show -> show.getMovie().getMovieName().equals(movie.getMovieName()) && show.getStartTime() >= startTime && show.getEndTime() <= endTime).
                collect(Collectors.toMap(Show::getStartTime, show -> show));
    }

    @Override
    public String toString() {
        return "Theatre{" +
                "theatreName='" + theatreName + '\'' +
                ", showMap=" + showMap +
                '}';
    }
}
