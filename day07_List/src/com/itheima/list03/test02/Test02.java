package com.itheima.list03.test02;
import java.util.Collection;
import java.util.LinkedList;

public class Test02 {
    public static void main(String[] args) {
        Collection<Double> collection=new LinkedList<>();
        collection.add(88.5);
        collection.add(39.2);
        collection.add(77.1);
        collection.add(56.8);
        collection.add(89.0);
        collection.add(99.0);
        collection.add(59.5);
        System.out.println("使用增强for循环遍历所有元素，并打印如下：");
        collection.forEach(System.out::println);

        System.out.println("使用增强for循环遍历所有元素，打印不及格分数如下：");

        double sum=0;
        int count=0;
        double a=0;
        for (Double v : collection) {
            if(v<60)
            {
                sum+=v;
                count++;
                System.out.println(v);
            }
            if(a<v)
                a=v;
        }
        System.out.println("不及格的分数有："+count+"个,不及格的人平均分是："+sum/count);
        System.out.println("集合中的最大值是："+a);
    }
}
