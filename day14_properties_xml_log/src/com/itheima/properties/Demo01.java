package com.itheima.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.function.BiConsumer;


public class Demo01 {
    public static void main(String[] args) throws Exception{
        Properties extracted = extracted();

        extracted.setProperty("zhangsan1","123");
        extracted.store(new FileOutputStream("day14_properties_xml_log/src/com/itheima/properties/user1.properties"),"属性");

        //   properties.forEach((k,v)-> System.out.println(k+"==>"+v));

        //6,properties.setProperty(key,value)将

    }
    private static Properties extracted() throws IOException {
        //1,首先创建一个Properties的对象，直接使用无参构造即可
        Properties properties=new Properties();
        //2,通过load方法填入需要加载的properties文件的地址，注意不是直接填入文件名，而是放入一个FileInputStream(文件路径)或者FileReader(文件路径)对象
        //当调用好这个load方法后，就会把数据直接封装到properties对象中（其实properties也是Map集合的一种）
        properties.load(new FileInputStream("day14_properties_xml_log/src/com/itheima/properties/user.properties"));
        //3，properties.getProperty()方法就是类似与集合中的根据键获取值get()
        String zhangsanValue = properties.getProperty("zhangsan");
        //4,properties.stringPropertyName()会返回一个Set集合，里面存放着键。
        Set<String> set = properties.stringPropertyNames();
        for (String s : set) {
            String property = properties.getProperty(s);
            System.out.println(s+"==>"+property);
        }


        //5，properties也可以通过


        properties.forEach((k,v)-> System.out.println(k+"="+v));

/*
        properties.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String k, String v) {
                System.out.println(k+"="+v);
            }
        });*/

        return properties;
    }
}
