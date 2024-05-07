package com.itheima.bigdecimal.demo01;

import java.math.BigDecimal;

public class Demo01 {
    public static void main(String[] args) {
        double a=0.1;
        double b=0.3;
        //浮点数的计算是偏精度计算--计算不准确，是存在偏差的
        System.out.println(a+b);

        BigDecimal a1 = new BigDecimal(String.valueOf(a));
        BigDecimal b1 = new BigDecimal(String.valueOf(b));

        //加法是add()
        BigDecimal add = a1.add(b1);
        System.out.println(add);

        //减法是subtract()
        BigDecimal su = b1.subtract(a1);
        System.out.println(su);

        //乘法是multiply()
        BigDecimal multiply = a1.multiply(b1);
        System.out.println(multiply);

        //除法是divide(),如果除不尽，应该指定保留几位小数，否则会抛出异常！
        BigDecimal divide = a1.divide(b1,2,BigDecimal.ROUND_DOWN);
        System.out.println(divide);

    }
}
