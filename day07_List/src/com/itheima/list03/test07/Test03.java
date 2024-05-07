package com.itheima.list03.test07;

import java.util.Collections;
import java.util.TreeSet;

public class Test03 {
    public static void main(String[] args) {
        TreeSet<Character> treeSet=new TreeSet<>((o1, o2) -> o1.compareTo(o2));
        String s="kjsdneosjsakewoiqercnjnvz923nj4339ufd";
        for (int i = 0; i < s.length(); i++)
            treeSet.add(s.charAt(i));
        treeSet.forEach(z-> System.out.print(z+" "));
    }
}

