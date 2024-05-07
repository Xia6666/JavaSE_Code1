package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateUtils {
    private DateUtils(){}

    public static int getAge(String s)
    {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        try {
            return (int)((System.currentTimeMillis()-simpleDateFormat.parse(s).getTime()) / 1000 / 60 / 60 / 24 / 365);
        } catch (ParseException  e) {
            System.err.println("输入的年龄格式不正确！请重新输入：");
            return -1;
        }
    }

}
