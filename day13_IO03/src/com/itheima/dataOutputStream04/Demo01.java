package com.itheima.dataOutputStream04;

import java.io.*;
/*
* 为了将数据内容及其数据的类型持久化，我们引入的DataOutputStream类和DataInputStream类用于将数据的类型和数据内容完整的存放到文件中。
* 注意：存入和取出的顺序一定要相同，否则可能出现解析异常。
* */
public class Demo01 {
    public static void main(String[] args) throws Exception{
        DataOutputStream dataOutputStream=new DataOutputStream(new FileOutputStream("day13_IO03/resource/d.txt"));
        dataOutputStream.writeInt(123);
        dataOutputStream.writeDouble(1.23);
        dataOutputStream.writeUTF("hello world");
        dataOutputStream.writeBoolean(false);
        dataOutputStream.close();

        DataInputStream inputStream=new DataInputStream(new FileInputStream("day13_IO03/resource/d.txt"));
        int i = inputStream.readInt();
        System.out.println(i);
        double v = inputStream.readDouble();
        System.out.println(v);
        String s = inputStream.readUTF();
        System.out.println(s);
        boolean b = inputStream.readBoolean();
        System.out.println(b);
        inputStream.close();

    }
}
