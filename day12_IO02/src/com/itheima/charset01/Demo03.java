package com.itheima.charset01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Demo03 {
    public static void main(String[] args) throws Exception {
        FileReader fr=new FileReader("day12_IO02/resource/a.txt");
        int read;
        StringBuilder stringBuilder=new StringBuilder();
        while ((read = fr.read())!=-1)
        {
            stringBuilder.append((char)read);
        }
        System.out.println(stringBuilder);

        fr.close();
    }

    private static void method01() throws IOException {
        FileInputStream in=new FileInputStream("day12_IO02/resource/a.txt");
        byte[] bytes=new byte[1024];
        int len = in.read(bytes);
        System.out.println(new String(bytes, 0, len));
        in.close();
    }
}
