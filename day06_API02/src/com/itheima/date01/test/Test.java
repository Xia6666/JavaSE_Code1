package com.itheima.date01.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        //SimpleDateFormat有两个方法 format(Date对象)用于格式化输出日期,parse(字符串)用于返回指定日期的Date对象

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日");

        Date date = simpleDateFormat.parse("2024年4月5日");
       // Date date1 = simpleDateFormat.parse("2024年4月11日");

        long time = date.getTime();

        Date date1=new Date();
        long time1 = date1.getTime();

       long a= (time1-time)/1000L/60/60/2;;
        System.out.println(a);

    }
}
