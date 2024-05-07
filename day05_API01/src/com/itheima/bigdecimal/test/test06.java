package com.itheima.bigdecimal.test;

public class test06 {
    public static void main(String[] args) {
        System.out.println(getSum(100));
    }
    public static int getSum(int n)
    {
        if(n==1)
            return 1;
        else {
            return n+getSum(n-1);
        }

    }
}
