package com.itheima.reader02;

import java.io.FileReader;
import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) throws Exception{
        //1,创建流
        FileReader fileReader=new FileReader("day12_IO02/resource/a.txt");//创建字符输入流的文件一定要存在，并且不能是文件夹

        //2,操作流
        int ch = fileReader.read();//一次读取一个字符,返回值是字符数据
        System.out.println((char) ch);

        char[] chars=new char[20];
        int len = fileReader.read(chars);//一次读取多个字符，返回值是读到的有效字符个数，有效字符内容再数组中，和FileInputStream中的原理类似。
        System.out.println(Arrays.toString(chars));



        //将读到的多个字符组装成一个完整的字符串
        String s = new String(chars, 0, len);
        System.out.println(s);

        //3,关闭流
        fileReader.close();
    }
}
