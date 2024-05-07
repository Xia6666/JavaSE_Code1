package com.itheima.list03;

import java.util.LinkedList;

public class Demo03 {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("Java");
        linkedList.add("JavaSE");
        linkedList.add("JavaWeb");

        linkedList.forEach(s-> System.out.print(s+","));
        System.out.println();

        linkedList.addFirst("JavaEE");
        linkedList.addLast("Java");
        linkedList.forEach(s-> System.out.print(s+","));
        System.out.println();

        linkedList.removeFirst();
        linkedList.forEach(s-> System.out.print(s+","));
        System.out.println();

        linkedList.removeLast();
        linkedList.forEach(s-> System.out.print(s+","));
        System.out.println();

    }
}
