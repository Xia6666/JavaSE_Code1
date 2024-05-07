package com.itheima.file02;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.IOException;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        //绝对路径：得从盘符开始
        File file01=new File("/Users/xiaquanen/IdeaProjects/JavaSE_Code_64/JavaSE_Code_64/day10_stream_File/bbb.txt");
        file01.createNewFile();

        //相对路径：从当前项目开始
        File file02=new File("day10_stream_File/ccc.txt");
        file02.createNewFile();

    }
}
