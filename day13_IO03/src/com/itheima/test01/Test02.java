package com.itheima.test01;

import org.apache.commons.io.IOUtils;

import java.io.*;

public class Test02 {
    public static void main(String[] args) throws Exception{
 /*       try(InputStreamReader ir=new InputStreamReader(new FileInputStream("day13_IO03/resource/b.txt"));
            OutputStreamWriter bw=new OutputStreamWriter(new FileOutputStream("day13_IO03/resource/f.txt"),"GBK"))
        {
            int ch;
            while ((ch=ir.read())!=-1)
            {
                bw.write((char)ch);
            }
        }catch (Exception e)
        {
                e.printStackTrace();
        }*/

        IOUtils.copy(new FileInputStream("day13_IO03/resource/b.txt"),new FileOutputStream("day13_IO03/resource/f.txt"));



    }
}
