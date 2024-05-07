package com.itheima.collection02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo03 {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("JavaSE");
        collection.add("JavaWeb");
        collection.add("项目一");
        collection.add("微服务技术");
        collection.add("项目二");
        collection.add("就业课");
        collection.add("项目三");


        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext())
        {
            String s=iterator.next();
           if(s.equals("JavaWeb")){
             // collection.remove("JavaWeb");
             iterator.remove();
            }else {
                System.out.println(s);
            }

        }
    }
}
