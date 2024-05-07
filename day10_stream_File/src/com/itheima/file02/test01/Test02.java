package com.itheima.file02.test01;

import java.io.File;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("day10_stream_File/abc");
        if(!file1.isDirectory())
            file1.mkdirs();
        File file2=new File(file1,"hello.java");
        file2.createNewFile();
        if(file2.isFile())
            System.out.println("hello.java是文件");
        else
            System.out.println("hello.java不是文件");
        System.out.println(file2.getName());
        file2.delete();

        file1.delete();
    }
}
