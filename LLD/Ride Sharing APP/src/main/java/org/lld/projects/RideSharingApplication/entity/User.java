package org.lld.projects.RideSharingApplication.entity;

abstract class User {
    protected String name;
    protected String email;
    protected String phoneNumber;
    protected Location location;

    public User() {
    }

    public User(String name, String email, String phoneNumber, Location location) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }


    public abstract void notify(String message);
}
