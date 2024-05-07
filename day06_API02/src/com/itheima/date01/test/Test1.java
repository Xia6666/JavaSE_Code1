package com.itheima.date01.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println("请输入你出生年月日（格式：----年--月--日）：");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        Date date = simpleDateFormat.parse(next);
        long l = (System.currentTimeMillis() - date.getTime()) / 1000 / 60 / 60 / 24;
        System.out.println("恭喜你来到这个时间"+l+"天了！");
    }
}
