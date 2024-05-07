package com.itheima.printWriter;

import java.io.PrintWriter;

/*
*
* 为了方便的将内容持久化，我们引入类printStream类和printReader类，该类中的print（）方法可以方便的将内容打印到文件中去
* 其实这两个类的功能区别不大，但是printReader类需要刷新才能将内容刷入到文件中去
*
* */
public class Demo01 {
    public static void main(String[] args) throws Exception{
        PrintWriter printWriter=new PrintWriter("day13_IO03/c.txt");

        printWriter.println("键盘敲烂！");
        printWriter.println("月薪过万！");

        printWriter.close();
    }
}
