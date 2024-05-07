package com.itheima.map01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
*       特点：是一种双列结构（Key-Value），键值对。
*            键是唯一的,值可以不唯一。
*
* */

/*public class Demo01 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("heima001","111");
        hashMap.put("heima002","222");
        hashMap.put("heima003","333");
        //键相同，值覆盖，相当于修改。键不存在，添加，键存在，修改。
        hashMap.put("heima001","222");


        System.out.println(hashMap);
    }
}*/
public class Demo01 {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        Collections.addAll(arrayList,"hewllo","nihao");
        System.out.println(arrayList);
    }

    }
