package org.bms.entity;

public class Movie {
    private String movieName;
    private String actor;
    private String actress;
    private String director;
    private String musicDirector;

    public Movie(){}

    public Movie(String movieName, String actor, String actress, String director, String musicDirector) {
        this.movieName = movieName;
        this.actor = actor;
        this.actress = actress;
        this.director = director;
        this.musicDirector = musicDirector;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActress() {
        return actress;
    }

    public void setActress(String actress) {
        this.actress = actress;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getMusicDirector() {
        return musicDirector;
    }

    public void setMusicDirector(String musicDirector) {
        this.musicDirector = musicDirector;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", actor='" + actor + '\'' +
                ", actress='" + actress + '\'' +
                ", director='" + director + '\'' +
                ", musicDirector='" + musicDirector + '\'' +
                '}';
    }
}
