package com.itheima.file02;

import java.io.File;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        //File的三种构造方式
        //通过new 并不会直接创建出一个新文件，需要调用createNewFile()方法。
        //方式一：直接写出要创建文件对象的绝对路径
        File file=new File("/Users/xiaquanen/IdeaProjects/JavaSE_Code_64/JavaSE_Code_64/day10_stream_File/stu.txt");
        file.createNewFile();

        //方式二：将要创建文件所要放的文件夹的路径先写出来，再在后面写要创建的文件名
        File file1=new File("/Users/xiaquanen/IdeaProjects/JavaSE_Code_64/JavaSE_Code_64/day10_stream_File/aaa","stu.txt");
        file1.createNewFile();

        //将要创建文件所要放的文件夹的路径先创建出一个File出来，然后再把这个对象和要创建的文件放入的File(形参列表中)
        File file2=new File("/Users/xiaquanen/IdeaProjects/JavaSE_Code_64/JavaSE_Code_64/day10_stream_File/aaa");
        File file3=new File(file2,"stu1.txt");
        file3.createNewFile();



    }
}
