package com.itheima.static_01;

public class Student {
    private String name;

    private int age;

    public static String School;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static String getSchool() {
        return School;
    }

    public static void setSchool(String school) {
        School = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void show1()
    {
        System.out.println(School);
        System.out.println(new Student().name);
    }

    public void show2()
    {
        System.out.println(School);
        System.out.println(name);

    }


}
