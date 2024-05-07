package com.itheima.charset01;

import java.io.FileInputStream;

/*
*
* 在UTF-8下，一个中文汉字占3个字节，而且对应的字节数字都是负数
* 在GBK下，一个中文汉字占2个字节
* */
public class Demo01 {
    public static void main(String[] args)throws Exception {
        FileInputStream fin=new FileInputStream("day12_IO02/resource/a.txt");
        int read1= fin.read();
        int read2= fin.read();
        int read3= fin.read();
        byte[] bytes={(byte) read1, (byte) read2, (byte) read3};
        System.out.println(new String(bytes));
        fin.close();
    }
}

/*
*
* 1，首先讲到了编码表，常见的编码标有ASCII，ISO，GBK，UTF
*   1.1其中GBK和UTF是包含中文的，但是GBK中的汉字占用两个字节，UTF中的汉字占有三个字节。但是他们有一个共同点汉字都是以负数存储的。
*   1.2这些码表其实都是兼容ASCII码表的，也就是说英文字母和一些英文符号的码值都是相同的
* 2，然后又讲到了字符读写流，他们的都是基于字符进行操作的，其中
*
*
*
* */