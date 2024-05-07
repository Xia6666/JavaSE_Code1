package com.itheima.wrapper;

public class Demo02 {
    public static void main(String[] args) {
        int a=10;
        Integer a1=a;
        Integer a2=new Integer(a);
        System.out.println(a1);
        System.out.println(a2);

        int c=a1;
        int d=a1.intValue();
        System.out.println(c);
        System.out.println(d);


    }
}
