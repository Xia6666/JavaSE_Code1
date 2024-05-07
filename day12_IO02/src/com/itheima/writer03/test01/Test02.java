package com.itheima.writer03.test01;

import java.io.FileReader;
import java.io.FileWriter;


//字符流不合适拷贝文件，只能拷贝文本文件，如果非文本文件就会出现乱码现象
//字符流适合将文本数据读到内存进行业务处理 --其中最好的是缓冲字符流
public class Test02 {
    public static void main(String[] args) throws Exception{
        FileReader fileReader=new FileReader("/Users/xiaquanen/Desktop/基于哈希函数求解方程根式.docx");
        FileWriter fileWriter=new FileWriter("/Users/xiaquanen/IdeaProjects/JavaSE_Code_64/JavaSE_Code_64/day12_IO02/aa.docx");

        int ch;
        while ((ch=fileReader.read())!=-1)
        {
            fileWriter.write((char)ch);
            fileWriter.flush();
        }

        fileReader.close();
        fileWriter.close();

    }
}
