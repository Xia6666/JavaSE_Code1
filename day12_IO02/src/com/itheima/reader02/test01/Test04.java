package com.itheima.reader02.test01;

import java.io.FileWriter;

public class Test04 {
    public static void main(String[] args) throws Exception{
        String str="流是一组有顺序的，有起点和终点的字节集合，是对数据传输的总称或抽象。即数据在两设备间的传输称为流，流的本质是数据传输，根据数据传输特性将流抽象为各种类，方便更直观的进行数据操作。";
        FileWriter fileWriter=new FileWriter("/Users/xiaquanen/IdeaProjects/JavaSE_Code_64/JavaSE_Code_64/day12_IO02/resource/IO流概念.txt");
        fileWriter.write(str);
        fileWriter.close();
    }
}
