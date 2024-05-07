package com.itheima.compare02.test03;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    //需求: 集合添加一些字符串, 要求按字符串长度进行排序,如果长度一致,则按字典顺序排序.
        public static void main(String[] args) {
            TreeSet<String> ts = new TreeSet<>((new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    int result = o1.length() - o2.length();
                    result = result == 0 ? o1.compareTo(o2) : result;
                    return result;
                }
            }));
            ts.add("c");
            ts.add("ab");
            ts.add("ab");
            ts.add("df");
            ts.add("qwer");
            System.out.println(ts);
        }
}
