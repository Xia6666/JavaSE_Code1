package com.itheima.collection02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Demo01 {
    public static void main(String[] args) {
        //创建一个collection集合对象
        Collection<String> collection=new ArrayList<>();
       /* collection.add();             //添加元素
        collection.remove();            //删除元素（根据索引删除元素是List集合特有的，所以在这默认是根据元素删除）
        collection.contains();          //是否包含元素
        collection.isEmpty();           //是否为空
        collection.clear();             //清除所以元素
        collection.size();              //集合中元素的个数
        */


        //添加元素  "杨过","小龙女","郭靖","黄蓉","欧阳克"
        collection.add("杨过");
        collection.add("小龙女");
        collection.add("郭靖");
        collection.add("黄蓉");
        collection.add("欧阳克");
        System.out.println(collection);

       /* collection.removeIf(new Predicate<String>() {
            @Override
            public boolean test01(String s) {
                return s.length() == 3;
            }
        });*/
          collection.removeIf(s -> s.length()==3);
        System.out.println(collection);



        //删除“杨过”
        collection.remove("杨过");
        System.out.println(collection);

        //判断是否有“欧阳克”
        boolean b = collection.contains("欧阳克");
        System.out.println(b);

        //判断集合是否为空
        boolean empty = collection.isEmpty();
        System.out.println(empty?"集合为空":collection.size());

        //清空集合
        collection.clear();
        System.out.println(collection);

        System.out.println(empty?"集合为空":collection.size());



    }




}
