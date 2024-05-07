package com.xiaqe.pojo;

import java.util.Objects;

public class User {
    private String useName;
    private String pws;
    public User() {
    }

    public User(String useName, String pws) {
        this.useName = useName;
        this.pws = pws;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        User user = (User) object;
        return Objects.equals(useName, user.useName) && Objects.equals(pws, user.pws);
    }

    @Override
    public int hashCode() {
        return Objects.hash(useName, pws);
    }

    @Override
    public String toString() {
        return useName+","+pws;
    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getPws() {
        return pws;
    }

    public void setPws(String pws) {
        this.pws = pws;
    }
}

