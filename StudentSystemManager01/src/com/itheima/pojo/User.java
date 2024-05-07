package com.itheima.pojo;

public class User {
    private String userName;
    private String userPws;

    public User() {
    }

    public User(String userName, String userPws) {
        this.userName = userName;
        this.userPws = userPws;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPws() {
        return userPws;
    }

    public void setUserPws(String userPws) {
        this.userPws = userPws;
    }
}
