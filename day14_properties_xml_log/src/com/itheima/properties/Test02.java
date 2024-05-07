package com.itheima.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Properties;

public class Test02 {
    public static void main(String[] args) throws Exception{
        Properties properties=new Properties();
        properties.load(new InputStreamReader(new FileInputStream("day14_properties_xml_log/src/com/itheima/properties/test.properties"),"UTF-8"));
        properties.forEach((k,v)-> System.out.println(k+"="+v));

        properties.setProperty("hobby","练武");
        properties.store(new OutputStreamWriter(new FileOutputStream("day14_properties_xml_log/src/com/itheima/properties/test.properties"),"UTF-8"),"ISO");
/*
        OutputStreamWriter op=new OutputStreamWriter(new FileOutputStream("/Users/xiaquanen/IdeaProjects/JavaSE_Code_64/JavaSE_Code_64/day14_properties_xml_log/src/com/itheima/properties/test.properties"),"ISO-8859-1");

        op.write("name=???");
        op.write(System.lineSeparator());
        op.flush();*/

    /*    FileOutputStream fileOutputStream=new FileOutputStream("day14_properties_xml_log/src/com/itheima/properties/test.properties");
        byte[] bytes = "name=???".getBytes("ISO-8859-1");
        fileOutputStream.write(bytes);
        fileOutputStream.flush();
        FileInputStream fileInputStream=new FileInputStream("day14_properties_xml_log/src/com/itheima/properties/test.properties");
        byte[] bytes1=new byte[1024];
        int len;
        len=fileInputStream.read(bytes1);
        String s=new String(bytes1,0,len,"ISO-8859-1");
        System.out.println(s);

*/

    }
}
