package com.itheima.date01.test01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private DateUtils()
    {}

    public static final String FORMAT_ONE="yyyy年MM月dd日 HH:mm:ss";
    public static final String FORMAT_TWO="yyyy-MM-dd HH时mm分ss秒";
    public static final String FORMAT_Three="yyyy年MM月dd日";

    public static final int ONE=1;
    public static final int TWO=2;
    public static final int Three=3;

    public static String getDate(Date date,int n)
    {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat();
        if(n==ONE)
        {
            simpleDateFormat =new SimpleDateFormat(FORMAT_ONE);
        }
        else if(n==TWO)
        {
            simpleDateFormat =new SimpleDateFormat(FORMAT_TWO);
        }
        else if(n==Three)
        {
            simpleDateFormat =new SimpleDateFormat(FORMAT_Three);
        }
            return simpleDateFormat.format(date);
    }

    public static String getTime(String s,int n) throws ParseException {
         SimpleDateFormat simpleDateFormat=new SimpleDateFormat();
        if(n==ONE)
        {
             simpleDateFormat =new SimpleDateFormat(FORMAT_ONE);
        }
        else if(n==TWO)
        {
            simpleDateFormat =new SimpleDateFormat(FORMAT_TWO);
        }
        else if(n==Three)
        {
            simpleDateFormat =new SimpleDateFormat(FORMAT_Three);
        }
        return simpleDateFormat.format(simpleDateFormat.parse(s));
    }

}
