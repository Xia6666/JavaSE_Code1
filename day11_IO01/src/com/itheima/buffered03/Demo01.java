package com.itheima.buffered03;

import java.io.BufferedOutputStream;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class Demo01 {
    public static void main(String[] args) throws Exception {
        BufferedOutputStream bop=new BufferedOutputStream(new FileOutputStream("day11_IO01/xia.txt"));
        bop.write("hello".getBytes(StandardCharsets.UTF_8));
        bop.close();
    }
}
