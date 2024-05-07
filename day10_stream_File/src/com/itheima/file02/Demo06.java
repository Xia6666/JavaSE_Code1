package com.itheima.file02;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Demo06 {
    public static void main(String[] args) throws IOException {
        File file=new File("/Users/xiaquanen/IdeaProjects/JavaSE_Code_64/JavaSE_Code_64/day10_stream_File/src");
        File file1=new File("/Users/xiaquanen/Desktop");
       // FileUtils.copyDirectory(file,file1);
        FileUtils.deleteDirectory(new File("/Users/xiaquanen/IdeaProjects/JavaSE_Code_64/test_jar01"));


    }
}
