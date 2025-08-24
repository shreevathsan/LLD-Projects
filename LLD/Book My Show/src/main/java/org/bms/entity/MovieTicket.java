package org.bms.entity;

import java.util.List;
import java.util.UUID;

public class MovieTicket {
    private String refNo;
    private City city;
    private Theatre theatre;
    private Show show;
    private double amount;
    private List<Seat> seats;
    private User user;

    public MovieTicket(City city, Theatre theatre, Show show, double amount, List<Seat> seats, User user) {
        this.refNo = UUID.randomUUID().toString();
        this.city = city;
        this.theatre = theatre;
        this.show = show;
        this.amount = amount;
        this.seats = seats;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    // Observer of Movie tickets
    public void notifyUserWithMovieTicket() {
        user.receiveMovieTicket(this);
    }

    public void notifyUserForCancellation(){
        user.receiveCancellationMessage(this);
    }

    @Override
    public String toString() {
        return "MovieTicket{" +
                "refNo='" + refNo + '\'' +
                ", city=" + city +
                ", theatre=" + theatre +
                ", show=" + show +
                ", amount=" + amount +
                ", seats=" + seats +
                ", user=" + user +
                '}';
    }
}
