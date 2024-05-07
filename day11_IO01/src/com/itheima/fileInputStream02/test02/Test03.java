package com.itheima.fileInputStream02.test02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test03 {
    public static void main(String[] args) throws Exception {
        BufferedInputStream in=new BufferedInputStream( new FileInputStream("day11_IO01/aaa.jpeg"));
       BufferedOutputStream op=new BufferedOutputStream(new FileOutputStream("day11_IO01/XQE/aaa.jpeg"));
        int len;
        byte[] bytes=new byte[1024];
        while ((len=in.read(bytes))!=-1)
        {
            op.write(bytes,0,len);
        }
        op.close();
        in.close();

    }
}
