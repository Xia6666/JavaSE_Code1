package com.itheima.fileInputStream02.test02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class Test01 {
    public static void main(String[] args) throws Exception {
        FileInputStream in=new FileInputStream("/Users/xiaquanen/Desktop/aaa.jpeg");
        FileOutputStream op=new FileOutputStream("day11_IO01/aaa.jpeg");

        long start = System.currentTimeMillis();
        byte[] bytes=new byte[16384];
        int len;
        while ((len=in.read(bytes))!=-1)
        {
            op.write(bytes,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

        in.close();
        op.close();


    }
}
