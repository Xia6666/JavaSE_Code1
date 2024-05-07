package com.itheima.buffered04;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Demo02 {
    public static void main(String[] args) throws Exception{
        BufferedWriter writer=new BufferedWriter(new FileWriter("day12_IO02/resource/b.txt",true));
        writer.write("qianqi=13579");
        writer.newLine();
        writer.write("qianqi=13579");
        writer.close();
    }
}
