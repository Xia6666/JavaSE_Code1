package com.itheima.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo02 {
    public static final Logger LOGGER= LoggerFactory.getLogger("com.itheima.log.Demo02");

    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Scanner scanner=new Scanner(System.in);
        while (true)
        {
            try {
                System.out.println("请输入你的生日(yyyy-MM-dd)：");
                String s=scanner.next();
                LOGGER.info("输入的年月日{}",s);
                Date date = simpleDateFormat.parse(s);
                long time = date.getTime();
                LOGGER.info("出生那天距离时间原点的毫米数{}",time);
                long l1 = System.currentTimeMillis();
                LOGGER.info("现在时间原点的毫米数{}",l1);
                long l = (l1 - time) / 1000 / 60 / 60 / 24 / 365;
                LOGGER.info("您已经活了{}",l);
            } catch (ParseException e) {
                LOGGER.error("文件格式输入不正确",e);
            }
        }

    }

}
