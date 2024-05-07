package com.heima.chenhui.code.test17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hashMap=new HashMap<>();
        ArrayList<String> arrayList1=new ArrayList<>();
        Collections.addAll(arrayList1,"诸葛亮","赵云");
        ArrayList<String> arrayList2=new ArrayList<>();
        Collections.addAll(arrayList2,"唐僧","孙悟空");
        ArrayList<String> arrayList3=new ArrayList<>();
        Collections.addAll(arrayList3,"武松","鲁智深");
        hashMap.put("三国演义",arrayList1);
        hashMap.put("西游记",arrayList2);
        hashMap.put("水浒传",arrayList3);

        Set<String> set = hashMap.keySet();

        for(String s:set)
        {
            System.out.println(s);
            hashMap.get(s).forEach(s1 -> System.out.println("\t"+s1));
        }
    }
}
