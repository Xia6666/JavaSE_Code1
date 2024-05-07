package com.itheima.date01.test02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入“你的生日”，格式是yyyy-MM-dd");
        String birthdayDate=scanner.next();
        Date date1 = simpleDateFormat.parse(birthdayDate);
        long time1 = date1.getTime();
        long time2 = System.currentTimeMillis();
        System.out.println(simpleDateFormat.format(date1));
        Date date2 = simpleDateFormat.parse("2000-00-00");
        long time3 = date2.getTime();
        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("yy年MM月dd天了！");
        System.out.println("您已经活了："+simpleDateFormat1.format(time2-time1+time3));


    }
}
