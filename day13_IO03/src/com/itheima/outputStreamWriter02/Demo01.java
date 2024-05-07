package com.itheima.outputStreamWriter02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

//同样的，当我们写入文件的时候需要指定格式的时候，就可以通过使用OutputStreamWriter来指定编码格式。当然通过字节写入的的时候通过使用将字节数组放到
public class Demo01 {
    public static void main(String[] args) throws Exception{
        try(OutputStreamWriter outputStreamWriter=new OutputStreamWriter(new FileOutputStream("day13_IO03/resource/b.txt"),"GBK"))
        {
            String str="我爱黑马！！！";
            outputStreamWriter.write(str);
        }catch (Exception e)
        {
            e.printStackTrace();
        }


        //以下是通过字节流的输入输出指定编码解码格式，

        FileOutputStream fileOutputStream=new FileOutputStream("day13_IO03/resource/c.txt");
        fileOutputStream.write("我爱黑马！！！".getBytes("GBK"));//通过String里面的转化方式将字符串通过指定的编码格式转化为字节数组，然后再通过字节输出流写入
        fileOutputStream.close();
        FileInputStream fileInputStream=new FileInputStream("day13_IO03/resource/c.txt");
        byte[] bytes=new byte[1024];
        int len=fileInputStream.read(bytes);
        String s=new String(bytes,0,len,"GBK");
        System.out.println(s);
        fileInputStream.close();
    }
}
