package com.itheima.date01.test05;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        //总结：Calendar类中主要掌握三个方法，set01(),get(),add()
       // set01():是将日历修改为你想要的那天，否则就是默认的系统值
        //get():获取日历中的内容
        //add():用于再次修改日历，然后再通过get()获取计算后的值

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入年份：");
        int str=scanner.nextInt();
        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.YEAR,str);
        calendar.set(Calendar.MONTH,2);
        calendar.set(Calendar.DATE,1);


        //calendar.add(Calendar.MONTH,-1);
        calendar.add(Calendar.DATE,-1);

        System.out.println(str+"年二月有："+(calendar.get(Calendar.DAY_OF_MONTH))+"天");


    }
}
