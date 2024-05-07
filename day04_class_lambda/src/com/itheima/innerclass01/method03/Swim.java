package com.itheima.innerclass01.method03;

public interface Swim {
    void swimming();
}

class Dog extends Animal implements Swim{

    @Override
    public void swimming() {
        System.out.println("狗学会了仰泳！");
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头！！！");
    }
}

abstract class Animal{

    public abstract void eat();

}