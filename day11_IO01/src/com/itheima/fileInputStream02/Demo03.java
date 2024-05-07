package com.itheima.fileInputStream02;

import java.io.FileInputStream;

public class Demo03 {
    public static void main(String[] args) throws Exception {
        //创建输入流
        FileInputStream in=new FileInputStream("day11_IO01/xia.txt");

        //一次读取多个字节,由于当读不到值的时候就会返回-1，可以通过这个来作为循环的执行条件
         byte[] bytes=new byte[1024];  //1024b=1kb

        //读到有效数据存在数组中，返回值表示读到了多少个有效字节
        int len = in.read(bytes);

        //将字节数组转化为字符串
        System.out.println(new String(bytes,0,len));

        //关闭资源
        in.close();
    }
}
