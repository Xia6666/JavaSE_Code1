package com.itheima.extends01.demo07;

public class Father {
    public Father()
    {
        System.out.println("我是父类无参构造");
    }
}
class Son extends Father{
    public Son()
    {
        //所有类的所有构造方法第一行都会有JVM默认添加super();
        System.out.println("我是子类无参构造");
    }

}
