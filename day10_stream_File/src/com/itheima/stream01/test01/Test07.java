package com.itheima.stream01.test01;

import java.util.ArrayList;
import java.util.Random;

public class Test07 {
    public static void main(String[] args) {
        Random random=new Random();
        ArrayList<Integer> arrayList=new ArrayList<>();
        while (arrayList.size()<10)
        {
          arrayList.add(random.nextInt(11) + 10);
        }
        arrayList.stream().filter(s->s>15).forEach(System.out::println);
    }
}
