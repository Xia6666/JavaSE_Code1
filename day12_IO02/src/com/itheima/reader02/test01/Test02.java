package com.itheima.reader02.test01;

import java.io.*;

public class Test02 {
    public static void main(String[] args) throws Exception {
        BufferedInputStream bufferedInputStream=new BufferedInputStream(new FileInputStream("day12_IO02/resource/aaa.jpeg"));
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(new FileOutputStream("day12_IO02/resource/bbb.jpeg"));
        int len;
        byte[] bytes=new byte[1024];
        while ((len=bufferedInputStream.read(bytes))!=-1)
        {
            bufferedOutputStream.write(bytes,0,len);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();

    }
}
