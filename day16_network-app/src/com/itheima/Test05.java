package com.itheima;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test05 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("HH时mm分ss秒");
        Date date = simpleDateFormat.parse("2024年4月29日 22时00分00秒");
        Date date1 = new Date();
        long l = date1.getTime() - date.getTime();



        String format = simpleDateFormat1.format(l);
        System.out.println(format);
    }
}
