package com.heima.chenhui.code.test16;

public class Student extends Person{
    private String id;


    public Student() {
    }

    public Student(String id) {
        this.id = id;
    }

    public Student(String name, int age, String id) {
        super(name, age);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                '}';
    }
}
