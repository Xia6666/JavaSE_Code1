package com.itheima.innerclass01.test05;

public class Test {
    public static void main(String[] args) {

        Person person1=new Man("张三",175);
        Person person2=new Woman("李四",160);
        Clothes clothes=new Clothes("耐克","黑色");

       if(person1 instanceof Man && person2 instanceof Woman)
       {

           ((Man) person1).behavior((Woman) person2);
       }

        if(person2 instanceof Woman)
        {

           ((Woman) person2).behavior(clothes);
        }

    }
}
