package com.itheima.date01.test01;

import java.text.ParseException;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        System.out.println(DateUtils.getDate(new Date(),2));

        System.out.println(DateUtils.getTime("2002年2月10日",3));
    }
}
