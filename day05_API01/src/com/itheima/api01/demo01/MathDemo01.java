package com.itheima.api01.demo01;

public class MathDemo01 {
    public static void main(String[] args) {

        //1,获取绝对值：Math.abs();
        double a=-666;
        double abs = Math.abs(a);
        System.out.println(abs);


        //需求1： 获取-666绝对值并打印
        //需求2： 获取3.14向上取整的结果并打印
        double b=3.14;
        double ceil = Math.ceil(b);
        System.out.println(ceil);


        //需求3： 获取3.59向下取整的结果并打印
        double c=3.59;
        System.out.println(Math.floor(c));

        //需求4： 获取4.51四舍五入的结果并打印
        double d=4.51;
        System.out.println(Math.round(d));

        //需求5： 使用Math获取一个[0,100]之间的随机整数并打印
        System.out.println((int)Math.ceil(Math.random()*100));

        //需求6： 使用Math获取一个[10,20]之间的较大值并打印
        System.out.println(Math.max(10, 20));
        //需求7： 使用Math获取一个[10,20]之间的较小值并打印
        System.out.println(Math.min(10, 20));
        //需求8： 使用Math获取  3的4次方 并打印
        System.out.println(Math.pow(3, 4));

        System.out.println(Math.PI);

    }
}
