package com.itheima.buffered04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;


public class Demo01 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new FileReader("day12_IO02/resource/b.txt"));
        String lin;
        HashMap<String,String> hashMap=new HashMap<>();
        while ((lin=reader.readLine())!=null)
        {
            String[] split = lin.split("=");
            hashMap.put(split[0],split[1]);
        }
        hashMap.forEach((k,v)-> System.out.println(k+"==>"+v));
    }

}
