package com.itheima.api01.demo01;

import java.util.Arrays;

public class SystemDemo03 {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6};
        int [] b=new int[10];
       /* System.out.println(b);
        System.out.println(Arrays.toString(b));
        System.arraycopy(a,0,b,0,6);
        System.out.println(Arrays.toString(b));*/

        System.arraycopy(a,2,b,b.length-4,4);
        System.out.println(Arrays.toString(b));

    }
}
