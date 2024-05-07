package com.itheima.fileInputStream02.test02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test04 {
    public static void main(String[] args) throws Exception{
        BufferedInputStream bin=new BufferedInputStream(new FileInputStream("day11_IO01/quan.txt"));
        BufferedOutputStream bop=new BufferedOutputStream(new FileOutputStream("day11_IO01/quan01.txt"));
        int len;
        while ((len=bin.read())!=-1)
        {
            len=len^(2);
            bop.write((char)len);
        }
        bin.close();
        bop.close();

    }
}
