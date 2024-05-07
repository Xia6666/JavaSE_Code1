package com.itheima.bigdecimal.test;
import java.math.BigDecimal;

public class Test04 {
    public static void main(String[] args) {
        double[] arr={0.1,0.2,2.1,3.2,5.56,7.21};

        BigDecimal sum=new BigDecimal(arr[0]+"");
        for (int i = 1; i < arr.length; i++) {
            sum=sum.add(new BigDecimal(arr[i]+""));
        }

        System.out.println(sum.divide(new BigDecimal(arr.length + ""), 2,BigDecimal.ROUND_HALF_UP));

    }
}
