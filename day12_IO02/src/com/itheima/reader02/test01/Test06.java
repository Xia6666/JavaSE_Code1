package com.itheima.reader02.test01;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class Test06 {
    public static void main(String[] args) throws Exception{
        BufferedWriter writer=new BufferedWriter(new FileWriter("day12_IO02/resource/e.txt"));
        ArrayList<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("jerry");
        list.add("Lucy");
        list.add("Lily");
        list.add("John");
        list.add("kevin");

        for (String s : list) {
            writer.write(s);
            writer.newLine();
        }

        writer.close();
    }
}
