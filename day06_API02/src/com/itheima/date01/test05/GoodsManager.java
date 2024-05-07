package com.itheima.date01.test05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class GoodsManager {
    public static ArrayList<Goods> arrayList=new ArrayList<>();
    static {
        arrayList.add(new Goods("鸭蛋",5));
        arrayList.add(new Goods("鸡蛋",3));
        arrayList.add(new Goods("手机",2));
    }

    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
    public void method() throws ParseException {
        Date date1 = simpleDateFormat.parse("2024年4月12日 14:00:00");
        Date date2 = simpleDateFormat.parse("2024年4月12日 14:30:00");

    }

}
