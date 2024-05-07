package com.itheima.printStream;

import java.io.PrintStream;

public class Demo01 {
    public static void main(String[] args) throws Exception{
        PrintStream printStream = new PrintStream("day13_IO03/resource/b.txt");
        printStream.println("你好啊");
        printStream.println("我是64期的学员");
        printStream.println("乾坤未定");
        printStream.println("你我皆是牛马");

        printStream.close();
    }
}
