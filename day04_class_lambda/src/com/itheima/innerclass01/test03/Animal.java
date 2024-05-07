package com.itheima.innerclass01.test03;

public abstract class Animal {

    public abstract void eat();
}
class Dog extends Animal{
    @Override
    public void eat()
    {
        System.out.println("狗吃饭！！！");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼！！！");
    }
}

class Pig extends Animal{
    @Override
    public void eat() {
        System.out.println("猪吃菜！！！");
    }
}
