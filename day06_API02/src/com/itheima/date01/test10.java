package com.itheima.date01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test10 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String format = simpleDateFormat.format(new Date());
        System.out.println(format);
    }
}
