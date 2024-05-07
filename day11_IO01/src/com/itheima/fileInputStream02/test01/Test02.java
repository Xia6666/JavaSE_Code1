package com.itheima.fileInputStream02.test01;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test02 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
       // method01();
        long end = System.currentTimeMillis();
        System.out.println("总耗时："+(end-start));
        long start1 = System.currentTimeMillis();
        method02();
        long end1 = System.currentTimeMillis();
        System.out.println("总耗时："+(end1-start1));
    }
    //一次读写一个字节
    public static void method01()
    {
        //1,创建字节输入输出流
        //4,释放资源
        try(FileInputStream in=new FileInputStream("/Users/xiaquanen/Desktop/aaa.jpeg");
            FileOutputStream op=new FileOutputStream("day11_IO01/aaa.jpeg"))
        {
            //2,定义临时变量，充当传输载体
            int ch;
            //3,循环读写
             while ((ch=in.read())!=-1) {
                 System.out.print((char)ch);
              op.write(ch);
              }

        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    //一次读写1024个字节
    public static void method02()
    {
        //1,创建字节输入输出流
        //4,释放资源
        try(FileInputStream in=new FileInputStream("/Users/xiaquanen/Desktop/aaa.jpeg");
            FileOutputStream op=new FileOutputStream("day11_IO01/aaa.jpeg"))
        {
            //2,定义临时变量，充当传输载体
            byte[] bytes=new byte[2];
            int len;
            while ((len=in.read(bytes))!=-1) {
                op.write(bytes,0,len);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
