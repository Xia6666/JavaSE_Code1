package com.itheima.file02.test01;

import java.io.File;
import java.util.Arrays;

public class Test03 {
    //删除aaa这个文件夹
    public static void main(String[] args) {
        File file = new File("day10_stream_File/aaa");
        deleteFile(file);
        file.delete();
    }
    public static void deleteFile(File file)
    {
        File[] files = file.listFiles();
        {
            for (File file1 : files) {
               if(file1.isFile()) {
                   file1.delete();
               }
               else if(file1.isDirectory())
                    deleteFile(file1);
            }
            for (File file1 : files)
                    file1.delete();
            }
        }
    }

