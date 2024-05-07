package com.itheima.wrapper;

public class Demo03 {
    public static void main(String[] args) {
        int a=10;
        String str=a+"";
        String string=String.valueOf(a);
        System.out.println(string);

        int a1=Integer.parseInt(str);
        System.out.println(a1);

        double d=10.0;
        //String sd=10.0+"";
        String sd =String.valueOf(d);
        System.out.println(sd);

        double c=Double.parseDouble(sd);
        System.out.println(c);

        System.out.println(Double.valueOf(sd));


        //注意Long在处理时候，不可以在字符串中加L，但是Float却可以加F
        String string1="12345443121L";
        Long num=Long.parseLong(string1);
        System.out.println(num);

        String string2="3.14F";
        Float num1=Float.parseFloat(string2);
        System.out.println(num1);


        //Integer.valueOf()和Integer.parseInt()最大的区别是返回值不同，前者返回引用类型，后者返回基本数据类型！前者底层也是调用了后者。
        //在使用引用类型的数据进行计算时候需要进行非空判断


    }
}
