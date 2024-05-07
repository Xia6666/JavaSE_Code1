package com.xiaqe.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Age {
    private Age() {}

    public static int getAge(String birthday) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

           Date date = simpleDateFormat.parse(birthday);

           return (int) ((System.currentTimeMillis()-date.getTime())/1000/60/60/24/365);

    }

}
