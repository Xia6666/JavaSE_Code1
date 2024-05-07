package com.itheima.api01.demo03;

import java.util.Arrays;

public class ArraysDemo03 {
    public static void main(String[] args) {
        int [] a={33,22,11,44,66,55};
        System.out.println(a);

        System.out.println(Arrays.toString(a));//将数组以字符串类型返回。

        sort(a);
        Arrays.sort(a);//对数组进行排序

        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.binarySearch(a, 11));//通过二分法查找对应元素的索引值

        System.out.println(Arrays.toString(Arrays.copyOf(a, 10)));//将数组拷贝的指定长度的新数组中去

    }
    public static void sort(int [] a)
    {
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>a[j])
                {
                    int c=a[j];
                    a[j]=a[i];
                    a[i]=c;
                }
            }
        }
    }
}
