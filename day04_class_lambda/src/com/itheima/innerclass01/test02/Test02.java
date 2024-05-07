package com.itheima.innerclass01.test02;

public class Test02 {
    public static void main(String[] args) {
        //Outer.method().show();

        Inter inter=new Inter() {
            @Override
            public void show() {
                System.out.println("hello world!");
            }
        };
        inter.show();

        Inter inter1=()-> System.out.println("Hello World!");
        inter1.show();


    }
}

interface Inter {
    void show();
}

class Outer {
    //补齐代码
}

