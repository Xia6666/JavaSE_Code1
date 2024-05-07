package com.itheima.date01.test03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        Scanner scanner=new Scanner(System.in);
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println("请输入第一个人的生日（格式为：yyyy年MM月dd日）：");
        String birthday01=scanner.next();
        Date date1 = simpleDateFormat.parse(birthday01);
        System.out.println("请输入第一个人的生日（格式为：yyyy年MM月dd日）：");
        String birthday02=scanner.next();
        Date date2 = simpleDateFormat.parse(birthday02);

        if(date1.getTime()-date2.getTime()>0)
        {
            System.out.println("第1个生日的人的年龄更小一些");
        }
        else if(date1.getTime()-date2.getTime()<0)
        {
            System.out.println("第1个生日的人的年龄更大一些");
        }
        else
            System.out.println("两人生日的人年龄相同！");

    }
}
