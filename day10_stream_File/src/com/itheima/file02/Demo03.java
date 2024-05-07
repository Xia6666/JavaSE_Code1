package com.itheima.file02;

import java.io.File;
import java.io.IOException;

public class Demo03 {
    public static void main(String[] args) throws IOException {
        //创建文件夹用mkdirs()方法
        File file1 = new File("day10_stream_File/bbb");
        System.out.println(file1.mkdirs());
        //创建文件用createNewFile()
        File file2=new File(file1,"abc.txt");
        file2.createNewFile();
        File file3=new File(file1,"ccc");
        file3.mkdirs();
        //删除用delete（）注意：文件夹中有有文件删除不了，只能删除空文件夹
        System.out.println(file1.delete());

        file2.delete();
        file3.delete();
        file1.delete();

    }
}
