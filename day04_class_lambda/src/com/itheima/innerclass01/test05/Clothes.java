package com.itheima.innerclass01.test05;

public class Clothes {
    private String name;
    private String colour;

    public Clothes() {
    }

    public Clothes(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
