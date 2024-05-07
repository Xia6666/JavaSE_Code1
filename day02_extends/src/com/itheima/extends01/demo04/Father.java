package com.itheima.extends01.demo04;

public class Father {

public int age=80;

}

class Son extends Father
{
   // public int age=18;

    public void method()
    {
        int age=16;
        System.out.println(age);
        System.out.println(this.age);
        //this之所以也能访问父类成员是因为this指代的该对象本身，而跟随着该对象产生的同时，父类也作为模版被创建到堆内存中去了，所以都是归属于一个对象，因此this可以调用。
        //
        System.out.println(super.age);

    }
}