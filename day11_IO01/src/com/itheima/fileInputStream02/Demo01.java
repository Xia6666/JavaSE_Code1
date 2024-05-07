package com.itheima.fileInputStream02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo01 {
    public static void main(String[] args) throws Exception {
        //创建输入流
        FileInputStream in=new FileInputStream("day11_IO01/xia.txt");

        //一次读读取一个字节
       /* int read = in.read();
        System.out.println((char) read);*/

        //一次读取多个字节,由于当读不到值的时候就会返回-1，可以通过这个来作为循环的执行条件
       int ch;
        while ((ch=in.read())!=-1)
        {
            System.out.print((char)ch);
        }
       /* int read1 = in.read(new byte[2]);
        System.out.println((char) read1);*/

        //关闭资源
        in.close();
    }
}
