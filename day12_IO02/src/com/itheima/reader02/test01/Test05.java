package com.itheima.reader02.test01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Test05 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new FileReader("day12_IO02/resource/c.txt"));

        int ch;
        StringBuilder stringBuilder=new StringBuilder();
        while ((ch=br.read())!=-1)
        {
            stringBuilder.append((char)ch);
        }
        br.close();
        String s = stringBuilder.toString();
        System.out.println(s);
    }
}
