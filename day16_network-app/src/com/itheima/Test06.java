package com.itheima;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Test06 {
    public static void main(String[] args) {

        LinkedHashMap<Character,Integer> linkedHashMap=new LinkedHashMap<>();

        String num="hello world";
        for (char c : num.toCharArray()) {
            linkedHashMap.put(c,linkedHashMap.getOrDefault(c,0)+1);//getOrDefault()方法的使用
        }
        linkedHashMap.forEach((k,v)-> System.out.println("字符'"+k+"'出现"+v+"次"));

      /*
        for (int i = 0; i < num.length(); i++) {

            if(linkedHashMap.containsKey(num.charAt(i)))
            {
                Integer i1 = linkedHashMap.get(num.charAt(i));
                i1++;
                linkedHashMap.put(num.charAt(i),i1);
            }
            else
                linkedHashMap.put(num.charAt(i),1);
        }
        linkedHashMap.forEach((k,v)-> System.out.println("字符'"+k+"'出现"+v+"次"));*/
    }
}
