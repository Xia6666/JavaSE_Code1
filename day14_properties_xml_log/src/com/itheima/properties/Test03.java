package com.itheima.properties;

import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

public class Test03 {
    public static void main(String[] args) throws Exception{
        //1，创建一个Properties对象
        Properties properties =new Properties();
        //2，通过load的方法加载文件
        properties.load(new FileReader("day14_properties_xml_log/src/com/itheima/properties/test.properties"));

        //3，通过stringPropertyName()方法一个set集合，里面存放了表中的键，其实properties也是一个Map集合，里面存放的页是键值对
        Set<String> set = properties.stringPropertyNames();
        //4，通过遍历键，然后通过getProperties方法获取里面的每一个值。
        for (String s : set) {
            String property = properties.getProperty(s);
            System.out.println(s+"="+property);
        }
        //5，也可以通过forEach()集合lambda表达式子进行遍历
        properties.forEach((k,v)-> System.out.println(k+"="+v));


    }
}
