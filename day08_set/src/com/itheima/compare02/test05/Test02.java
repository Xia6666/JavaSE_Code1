package com.itheima.compare02.test05;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Test02 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet=new TreeSet<>();
        Random random=new Random();
        int i=1;
        while (treeSet.size()<8)
        {
            int result=random.nextInt(11)+10;
            System.out.println("第"+i+"次生成的随机数是："+result);
            treeSet.add(result);
            i++;
        }
        System.out.println("集合中保存的8个不重复的随机数是："+treeSet);
    }
}
