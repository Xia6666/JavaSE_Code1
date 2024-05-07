package com.itheima.stream01.test01;

public class Test06 {
    public static void main(String[] args) {
        System.out.println("2个整数的和"+sum(1,2));
        System.out.println("3个整数的和"+sum(1,2,3));
        System.out.println("4个整数的和"+sum(1,2,3,4));

    }
    public static int sum(int...a)
    {
        int count=0;
        for (int i = 0; i < a.length; i++) {
            count=a[i]+count;
        }
        return count;
    }
}
