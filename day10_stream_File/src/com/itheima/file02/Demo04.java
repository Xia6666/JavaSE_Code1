package com.itheima.file02;

import java.io.File;

public class Demo04 {
    public static void main(String[] args) {
        //exists()方法判断文件或文件夹是否存在
        //isDirectory()方法判断文件夹是否存在
        //isFile()方法判断文件是否存在


        File file1=new File("day10_stream_File/aaa");
        File file2=new File("day10_stream_File/bbb");
        File file3=new File("day10_stream_File/abc.txt");
        File file4=new File(file1,"aaa.txt");

        System.out.println(file1.exists());
        System.out.println(file2.exists());
        System.out.println(file3.exists());
        System.out.println(file4.exists());

        System.out.println("==========");
        System.out.println(file1.isDirectory());
        System.out.println(file2.isDirectory());
        System.out.println(file3.isDirectory());
        System.out.println(file4.isDirectory());

        System.out.println("==========");
        System.out.println(file1.isFile());
        System.out.println(file2.isFile());
        System.out.println(file3.isFile());
        System.out.println(file4.isFile());


    }
}
