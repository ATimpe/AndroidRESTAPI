package com.arthurtimpe.androidrestapi;

public class User {
    private String username;
    private String password;
    private int userId;

    public User(String username, String password, int userId) {
        this.username = username;
        this.password = password;
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getUserId() {
        return userId;
    }
}
