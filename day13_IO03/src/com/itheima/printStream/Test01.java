package com.itheima.printStream;

import java.io.PrintStream;
import java.io.PrintWriter;

public class Test01 {
    public static void main(String[] args) throws Exception{
        //使用字符打印流需要刷新，不然字符去不了文件中
        //使用字节流打印流不需要刷新
        //但是二者都需要关流
        PrintWriter printWriter=new PrintWriter("day13_IO03/resource/k.txt");
        printWriter.println("乾坤未定，你我都是牛马");
        printWriter.close();

        PrintStream printStream=new PrintStream("day13_IO03/resource/k.txt");
        printStream.println("键盘敲烂，月薪过万");

    }
}
