package com.itheima.lambda02.demo01;


@FunctionalInterface

//必须是接口，并且有且只有一个抽象方法
public interface Swim {
    int a = 0;
    void swimming();
    static void method()
    {
        System.out.println("hello");
    }
}
