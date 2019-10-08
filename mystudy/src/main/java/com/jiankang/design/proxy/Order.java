package com.jiankang.design.proxy;

public class Order {

    private int userId;
    private String username;

    @Override
    public String toString() {
        return "Order{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
