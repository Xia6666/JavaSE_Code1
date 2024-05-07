package com.itheima.reader02.test01;

import java.io.*;

public class Test03 {
    public static void main(String[] args) throws Exception {
        FileInputStream in=new FileInputStream("day12_IO02/resource/aaa.jpeg");
        FileOutputStream op=new FileOutputStream("day12_IO02/resource/bbb.jpeg");
        int len;
        byte[] bytes=new byte[1024];
        while ((len=in.read(bytes))!=-1)
        {
            op.write(bytes,0,len);
        }
        in.close();
        op.close();
    }
}
