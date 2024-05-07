package com.itheima.innerclass01;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        double[] arr = {1.2, 0.6, 0.01, 3.2, 50.78};
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            BigDecimal bigDecimal = new BigDecimal(args[i] + "");
            BigDecimal bigDecimal1 = new BigDecimal(sum+"");
           // sum=bigDecimal1.add(bigDecimal);

        }



    }



}
