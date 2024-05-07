package com.itheima.test01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test04 {
    public static void main(String[] args) {
        try(DataInputStream di=new DataInputStream(new FileInputStream("day13_IO03/resource/f.txt"));
            DataOutputStream dO= new DataOutputStream(new FileOutputStream("day13_IO03/resource/f.txt"));
            )
        {
            dO.writeInt(1123);
            dO.writeDouble(11.23);
            dO.writeUTF("你好");
            dO.writeBoolean(true);

            System.out.println(di.readInt());
            System.out.println(di.readDouble());
            System.out.println(di.readUTF());
            System.out.println(di.readBoolean());
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
