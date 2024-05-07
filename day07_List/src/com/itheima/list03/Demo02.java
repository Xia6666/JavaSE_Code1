package com.itheima.list03;

import java.util.ArrayList;
import java.util.List;

public class Demo02 {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();

        list.add(11);
        list.add(22);
        list.add(44);
        list.add(55);

        list.add(2,33);
        list.forEach(s-> System.out.print(s+","));
        System.out.println();

        System.out.println(list.get(list.size() - 1));

        list.set(0,8);
        list.forEach(s-> System.out.print(s+","));
        System.out.println();

        list.remove((Integer) 22);
        list.forEach(s-> System.out.print(s+","));
        System.out.println();

        //i只是复制了一份list集合中的值，所以改变i的值，并不会改变原来集合中的值
        for (Integer i : list) {
            if(i==44)
                i=20;
            System.out.println(i);
        }

    }
}
