package com.itheima.annotation;

public class Cat {
    private String name;
    private int age;


    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @MyPrint(name = "小猫",value = "吃",age = 10)
    public void run()
    {
        System.out.println("小猫在跑！");
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

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
