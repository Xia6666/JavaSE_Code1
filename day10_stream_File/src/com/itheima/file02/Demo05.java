package com.itheima.file02;

import java.io.File;
import java.util.Arrays;

public class Demo05 {
    public static void main(String[] args) {
        File file = new File("day10_stream_File/aaa");
        File[] files = file.listFiles();
        System.out.println(Arrays.toString(files));
    }
}
