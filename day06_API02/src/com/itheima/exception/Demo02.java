package com.itheima.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Demo02 {
    //throws只会保证能过编译，但是没有真正解决问题！main方法中不能再把异常抛给jvm，应该及时解决。


    public static void main(String[] args) {
        method();
    }
    public static void method() {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        try {
            simpleDateFormat.parse("2024,4,12");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("执行到我这里了");

    }
}
