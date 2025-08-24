package org.bms.entity;

public class User {
    private String userName;
    private String email;
    private String mobile;

    public User(String userName, String email, String mobile) {
        this.userName = userName;
        this.email = email;
        this.mobile = mobile;
    }

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void receiveMovieTicket(MovieTicket movieTicket) {
        System.out.println("Movie ticket details are :" + movieTicket);
    }

    public void receiveCancellationMessage(MovieTicket movieTicket) {
        System.out.println("Your tickets are cancelled and the amount would get transferred soon " + movieTicket);
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
