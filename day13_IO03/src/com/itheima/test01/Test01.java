package com.itheima.test01;

import org.apache.commons.io.FileUtils;

import java.io.*;

public class Test01 {
    public static void main(String[] args) throws Exception{
  /*      try (BufferedInputStream bi=new BufferedInputStream();
             BufferedOutputStream op=new BufferedOutputStream()
        ){
            int len;
            while ((len=bi.read())!=-1)
            {
                op.write(len);
            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }
*/
        FileUtils.copyFile(new File("day13_IO03/resource/aaa.jpeg"),new File("day13_IO03/resource/ccc.jpeg"));




    }
}
