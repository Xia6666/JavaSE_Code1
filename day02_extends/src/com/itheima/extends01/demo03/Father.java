package com.itheima.extends01.demo03;
//Java中的继承都是单继承

class Ye{
    public void drink()
    {
        System.out.println("喝酒");
    }
}


public class Father extends Ye{
public void smoke()
{
    System.out.println("抽烟");
}
}

class Son extends Father{
    public void tang()
    {
        System.out.println("烫头");
    }
}