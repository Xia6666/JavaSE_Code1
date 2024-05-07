package com.itheima.reader02.test01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class Test08 {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader=new BufferedReader(new FileReader("day12_IO02/resource/msg.txt"));
        HashMap<String,String> hashMap=new HashMap<>();
        String student;
        while ((student=bufferedReader.readLine())!=null)
        {
            hashMap.put(student.split("=")[0],student.split("=")[1]);
        }
        hashMap.forEach((k,v)-> System.out.println(k+"==>"+v));
    }
}
