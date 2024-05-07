package com.itheima.writer03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) throws Exception{
        //创建流
        FileWriter fw=new FileWriter("day12_IO02/resource/c.txt");
        //操作流
        //写一个字符
        fw.write('黑');
        //写多个字符
        char[] chars={'马','程','序','员'};
        fw.write(chars);
        //写一部分字符
        char[] chars1={'好','好','学','习'};
        fw.write(chars1,0,3);

        //写入字符串
        fw.write(System.lineSeparator());
        fw.write("键盘敲烂，月薪过万");
        //关闭流,不关流，数据写不进去
        fw.close();


        //FileOutputStream中写入文件归根到底是通过字节或者字节数组写入的，即使是字符串也是通过转化为字节数组再写入，这和字符流最大的区别
        FileOutputStream fop=new FileOutputStream("day12_IO02/resource/c.txt",true);
        fop.write(System.lineSeparator().getBytes(StandardCharsets.UTF_8));
        fop.write("黑".getBytes(StandardCharsets.UTF_8));

        fop.write("马程序员".getBytes(StandardCharsets.UTF_8));

        byte[] bytes = "好好学习".getBytes();
        fop.write(bytes,0,9);
        System.out.println(Arrays.toString(bytes));

        fop.write(System.lineSeparator().getBytes(StandardCharsets.UTF_8));

        fop.write("键盘敲烂，月薪过万".getBytes(StandardCharsets.UTF_8));
        fop.close();

    }
}
