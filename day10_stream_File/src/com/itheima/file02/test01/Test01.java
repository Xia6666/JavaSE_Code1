package com.itheima.file02.test01;

import java.io.File;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
        File file=new File("day10_stream_File/bbb");
        if(!file.exists())
            file.mkdirs();
        if(file.isFile())
        {
            file.delete();
            file.mkdirs();
        }
        if(file.isDirectory())
            new File(file,"a.txt").createNewFile();
    }
}
