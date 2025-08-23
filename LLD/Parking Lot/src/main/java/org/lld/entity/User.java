package org.lld.entity;

public class User {

    private String userName;

    private String email;

    private String mobileNumber;

    public User(String userName, String email, String mobileNumber) {
        this.userName = userName;
        this.email = email;
        this.mobileNumber = mobileNumber;
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

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void notify(String message) {
        System.out.println("User" + this.userName + " notified with the message: " + message);
    }
}
