package com.itheima.inputStreamReader01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class Test01 {
    public static void main(String[] args) throws Exception{
        //字符转化流，通过InputStreamReader和OutputStreamWriter两个类来实现，里面的构造函数需要传递一个字节流对象，但是他们本身又是属于字符流
        //形参列表中存放一个字节流对象，和一个字符编码集格式用于指定解码和编码的格式
        InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream("day13_IO03/resource/a.txt"),"GBK");
        OutputStreamWriter outputStreamWriter=new OutputStreamWriter(new FileOutputStream("day13_IO03/resource/g.txt"), StandardCharsets.UTF_16);
        char[] chars=new char[1024];
        int len;

        while ((len=inputStreamReader.read(chars))!=-1)
        {
           outputStreamWriter.write(chars,0,len);
        }

        outputStreamWriter.close();
        inputStreamReader.close();

    }
}
