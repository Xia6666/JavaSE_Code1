package com.itheima.list03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("hello");
        list.add("hello");
        list.add("Java");
        list.add("World");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //普通迭代器遍历
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        //高级迭代器遍历
        for (String s : list) {
            System.out.println(s);
        }

        //最高级的迭代器遍历
        list.forEach(s-> System.out.println(s));


        //后三种方法因为都是基于迭代器，所以都有并发修改异常，（底层的实际操作值与预期的操作值不相等导致的）

    }
}
