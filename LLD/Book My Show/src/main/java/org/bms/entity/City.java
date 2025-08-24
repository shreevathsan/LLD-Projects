package org.bms.entity;

import java.util.Map;
import java.util.stream.Collectors;

public class City {
    private String cityName;
    private Map<String, Theatre> theatreMap;

    public City(String cityName, Map<String, Theatre> theatreMap) {
        this.cityName = cityName;
        this.theatreMap = theatreMap;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Map<String, Theatre> getTheatreMap() {
        return theatreMap;
    }

    public void setTheatreMap(Map<String, Theatre> theatreMap) {
        this.theatreMap = theatreMap;
    }

    /**
     * Method to return / display the theatre for the specific requested movie in the city
     *
     * @param movie
     * @return
     */
    public Map<String, Theatre> getTheatreForTheRequestedMovie(Movie movie) {
        return theatreMap.values().stream()
                .filter(theatre -> theatre.getShowMap().values().stream()
                        .anyMatch(show -> show.getMovie().getMovieName().equals(movie.getMovieName())
                                && show.getStartTime() >= System.currentTimeMillis()))
                .collect(Collectors.toMap(Theatre::getTheatreName, theatre -> theatre));
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", theatreMap=" + theatreMap +
                '}';
    }
}
