package com.itheima.writer03;

import java.io.FileWriter;

public class Demo02 {
    public static void main(String[] args) throws Exception{
        //flush:将数据从缓存区刷新的磁盘上去
        //close：关闭流，默认刷新缓存区的内容到磁盘上去

        FileWriter fw=new FileWriter("day12_IO02/resource/d.txt");
        fw.write("好好学习");
        fw.write("天天向上");
        fw.write("键盘敲烂");
        fw.write("月薪过万");

        fw.close();


    }
}
