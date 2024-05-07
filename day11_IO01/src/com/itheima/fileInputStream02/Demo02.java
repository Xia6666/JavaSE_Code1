package com.itheima.fileInputStream02;

import java.io.FileInputStream;

public class Demo02 {
    public static void main(String[] args) throws Exception {
        //创建输入流
        FileInputStream in=new FileInputStream("day11_IO01/xia.txt");

        //一次读取一个字节,由于当读不到值的时候就会返回-1，可以通过这个来作为循环的执行条件
       int ch;
        while ((ch=in.read())!=-1)
        {
            System.out.print((char)ch);
        }


        //关闭资源
        in.close();
    }
}
