package com.itheima.extends01.demo01;

public class Father {
    public void method()
    {
        System.out.println("我是父类");

    }
}

class Son extends Father{

    public void method() {
        System.out.println("我是子类");
    }
    public void test()
    {
        System.out.println("我是子类特有的方法！");
    }
}