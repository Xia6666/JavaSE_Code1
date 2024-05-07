package com.itheima.date01;

import java.util.Calendar;

public class Demo03 {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();//默认指向当前系统时间
       System.out.println(calendar);
 /*     calendar.set01(Calendar.YEAR,2024);
        calendar.set01(Calendar.MONTH,3);
        calendar.set01(Calendar.DATE,12);
*/


        //计算十天前是周几
//1，将日历往前推十天
        calendar.add(Calendar.MONTH,-3);
       // calendar.add(Calendar.DATE,-12);
        System.out.println("年："+calendar.get(Calendar.YEAR));
        System.out.println("月："+(calendar.get(Calendar.MONTH)+1));
        System.out.println("日："+calendar.get(Calendar.DATE));
        System.out.println("十天前是周"+(calendar.get(Calendar.DAY_OF_WEEK)-1));


    }
}
