package com.itheima.properties;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) throws Exception{
        Properties properties=new Properties();
        properties.load(new FileInputStream("day14_properties_xml_log/src/com/itheima/properties/user1.properties"));

        String zhangsan = properties.getProperty("zhangsan");
        System.out.println("zhangsan的值是"+zhangsan);

        Set<String> set = properties.stringPropertyNames();
        for (String s : set) {
            System.out.println(s+"==>"+properties.getProperty(s));
        }

        properties.forEach((k,v)-> System.out.println(k+"==>"+v));
    }
}
