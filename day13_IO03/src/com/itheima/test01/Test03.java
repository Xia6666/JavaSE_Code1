package com.itheima.test01;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Test03 {
    public static void main(String[] args) {
        try(PrintWriter printWriter=new PrintWriter(new FileWriter("day13_IO03/resource/f.txt"))) {
            printWriter.println("日志信息1");
            printWriter.println("日志信息2");
            printWriter.println("日志信息3");
            printWriter.println("日志信息4");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
