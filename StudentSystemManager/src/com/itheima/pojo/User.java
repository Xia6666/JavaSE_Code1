package com.itheima.pojo;

public class User {
    private String useName;
    private String pwd;

    public User(String useName, String pwd) {
        this.useName = useName;
        this.pwd = pwd;
    }

    public User() {
    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
