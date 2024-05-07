package com.itheima.date01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo02 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat();

        //format方法可以将日期格式转化为自定义类型
        String format = simpleDateFormat.format(date);
        System.out.println(format);

        //
       // parse()用于返回一个指定日期的Date对象。
        String string="2002年02月10号";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy年MM月dd号");
        Date parse = simpleDateFormat1.parse(string);
        System.out.println(parse.getTime());
        System.out.println(simpleDateFormat1.format(parse));


    }
}
