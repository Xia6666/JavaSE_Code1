package com.itheima.resursion.demo01;

public class Demo01 {
    public static void main(String[] args) {

        System.out.println(getSum(5));
    }
    public static int getSum(int n){
       if(n==1)
       {
           return 1;
       }
       else
           return n*getSum(n-1);

    }
}
