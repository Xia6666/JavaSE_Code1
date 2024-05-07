package com.itheima.bigdecimal.test;
import java.math.BigDecimal;
/*
* 1.有一个double类型的数组 double[] arr = {1.2, 0.6, 0.01, 3.2, 50.78}
*使用BigDecimal求数组中元素的平均值,并保留两位小数(直接截取)
* */
public class Test01 {
    public static void main(String[] args) {
        double[] arr={1.2, 0.6, 0.01, 3.2, 50.78};

        BigDecimal sum=new BigDecimal(arr[0]+"");
        for (int i = 1; i < arr.length; i++) {
            sum=sum.add(new BigDecimal(arr[i]+""));
        }

        System.out.println(sum.divide(new BigDecimal(arr.length + ""), 2));

    }
}
