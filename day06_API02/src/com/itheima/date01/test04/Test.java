package com.itheima.date01.test04;

public class Test {
    public static void main(String[] args) {

        for (int i = 2; i <=11; i++) {
            System.out.print(method(i)+" ");
        }
    }
    public static int method(int n)
    {
        if(n==1)
        {
            return 0;
        }
        else if (n==2) {
            return 1;
        } else
        {
           return method(n-1)+method(n-2);
        }
    }
}
