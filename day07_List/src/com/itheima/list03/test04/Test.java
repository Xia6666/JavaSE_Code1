package com.itheima.list03.test04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>() ;

// 添加元素
        list.add("itheima") ;
        list.add("itcast") ;
        list.add("传智播客") ;
        list.add("itheima") ;

// 获取迭代器对象，通过迭代器对象对集合进行遍历
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {

            // 获取元素
            String next = iterator.next();
            if(next.equals("itheima")) {
                list.remove(next) ;
            }

        }

// 遍历集合
        list.forEach( s -> System.out.println(s) );
    }
}
