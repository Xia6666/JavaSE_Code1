package com.itheima.innerclass01.method03;

public class Test {
    public static void main(String[] args) {
        Swim swim=new Dog();
        swim.swimming();

      /*  Swim flog=new Swim() {
            @Override
            public void swimming() {
                System.out.println("青蛙学会了狗刨！");
            }
        };
        flog.swimming();*/

        new Swim() {
            @Override
            public void swimming() {
                System.out.println("青蛙学会了狗刨");
            }
        }.swimming();



        if(swim instanceof Dog)
        {
            Dog dog = (Dog) swim;
            dog.eat();
        }

        method(new Animal() {
            @Override
            public void eat() {
                System.out.println("猫吃鱼！！！");
            }
        });
    }
    public static void method(Animal animal)
    {
        animal.eat();
    }
}
