package com.itheima.inputStreamReader01;

import java.io.FileInputStream;
import java.io.InputStreamReader;

//为了解决指定解码的编码集格式，引入了InputStreamReader,他的有参构造需要传递一个FileInputStream类型的对象，在后面可以追加解码格式。


public class Demo01 {
    public static void main(String[] args) throws Exception{
        try(InputStreamReader ir=new InputStreamReader(new FileInputStream("day13_IO03/resource/a.txt"),"GBK"))
        {
            int ch;
            while ((ch=ir.read())!=-1)
            {
                System.out.println((char)ch);
            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
