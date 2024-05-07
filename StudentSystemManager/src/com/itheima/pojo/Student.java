package com.itheima.pojo;

public class Student {
    private String name;
    private String sex;
    private String id;
    private double score;
    private int age;

    public Student() {
    }

    public Student(String name, String sex, String id, double score, int age) {
        this.name = name;
        this.sex = sex;
        this.id = id;
        this.score = score;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
