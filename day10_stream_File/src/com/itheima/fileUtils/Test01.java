package com.itheima.fileUtils;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class Test01 {
    public static void main(String[] args) {
        File file=new File("/Users/xiaquanen");

        getName(file);

    }
    public static void getName(File file)
    {
        File[] files = file.listFiles();
        if (files != null) {
            for (File file1 : files) {
                if(file1.isFile()&&file1.getName().contains(".jpeg"))
                {
                    System.out.println(file1.getName()+"==>"+file1.getPath());
                }
                else {
                    getName(file1);
                }

            }
        }

    }

}
