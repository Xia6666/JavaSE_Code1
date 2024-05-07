package com.itheima.fileOutputStream01;

import java.io.FileOutputStream;

public class Demo01 {
    public static void main(String[] args) throws Exception {
        //1，如果没有该文件，默认会自动创建一个文件
        //2，如果文件中有内容，默认是自动删除的，如果不想删除，就需要加参数true；

        //创建流
        FileOutputStream fileOutputStream=new FileOutputStream("day11_IO01/xia.txt");
        //使用流
        fileOutputStream.write(97);

        //需要关闭流
        fileOutputStream.close();
    }
}
