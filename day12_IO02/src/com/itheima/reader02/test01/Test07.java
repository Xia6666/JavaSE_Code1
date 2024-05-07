package com.itheima.reader02.test01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

public class Test07 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader=new BufferedReader(new FileReader("day12_IO02/resource/student.txt"));
        Random random=new Random();
        ArrayList<String> arrayList=new ArrayList<>();
        String name;
        while ((name=bufferedReader.readLine())!=null)
        {
            arrayList.add(name);
        }
        System.out.println(arrayList.get(random.nextInt(arrayList.size())));
        bufferedReader.close();
    }
}
