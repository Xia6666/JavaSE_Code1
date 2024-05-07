package com.itheima.date01;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01 {
    public static void main(String[] args) {
        //无参构造，
        Date date1=new Date();
        System.out.println(date1);
        //有参构造创建一个距离时间原点的时间。
        Date date2=new Date(0);
        System.out.println(date2);


        Date date3=new Date(24*60*60*1000);
        System.out.println(date3);

        Date date4=new Date(-(60*60*1000));
        System.out.println(date4);

        System.out.println(new BigDecimal(System.currentTimeMillis() + "").divide(new BigDecimal(24 * 60 * 60 * 100 + ""),2));
        System.out.println(System.currentTimeMillis());

        //getTime,获取当前时间距离时间原点的毫秒值。
        System.out.println(date1.getTime());
        //setTime,修改距离时间原点的毫秒值
        date1.setTime(1800090003243L);
        System.out.println(date1);


        //写一个冒泡排序
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
