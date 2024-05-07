package com.itheima.collection02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02 {
    public static void main(String[] args) {
        //创建一个collection集合对象
        Collection<String> collection=new ArrayList<>();

        collection.add("杨过");
        collection.add("小龙女");
        collection.add("郭靖");
        collection.add("黄蓉");
        collection.add("欧阳克");
        collection.add("欧阳克");
       /* System.out.println(collection);

          collection.removeIf(s -> s.length()==3);
        System.out.println(collection);
*/
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext())
        {
            String next = iterator.next();
            System.out.println(next);

            String next1 = iterator.next();
            System.out.println(next1);          //记住每次调用next()方法不仅仅获取元素，指针也会往后移一位！！
        }


        //迭代器本身就类似一个指针，首先在集合的头节点，通过hasNext()方法判断下个节点有没有元素，如果有就可以通过next()方法获取元素，并且将指针下移一位
        //如此遍历到集合的最后一个元素时，hasNext()判断到下个元素为空，就退出循环了，避免空指针异常。

    }




}
