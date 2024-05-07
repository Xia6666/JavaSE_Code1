package com.itheima.innerclass01.test05;

public class Woman extends Person{

        public Woman() {
        }

        public Woman(String name, double height) {
            super(name, height);
        }

        public  void behavior(Clothes clothes)
        {
            System.out.print(super.getName()+"在做饭！");
            System.out.println("还在洗"+clothes.getName()+"衣服");
        }
    }

