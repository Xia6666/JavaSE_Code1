package com.itheima.xml;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/*
* SAXReader===>read()====>Document(整个表单)====getRootElement()====>Element(具体的根标签的对象)===>elements()=====>Element(子标签对象)
*
*
* */

public class Demo01 {
    public static void main(String[] args) throws Exception{
        //1,获取xml中的内容第一步先创建一个SAXReader对象，通过该对象调用read方法获取一个Document对象（相当于整个表单）
        SAXReader saxReader=new SAXReader();
        Document document = saxReader.read("day14_properties_xml_log/src/com/itheima/xml/user.xml");
        System.out.println(document.getName());

        System.out.println();
        //2,通过Document对象调用getRootElement()方法获取根目录的Element对象，
        Element rootElement = document.getRootElement();

        //3，通过根目录对象调用getName()获取根目录的名称
        System.out.println(rootElement.getName());

        System.out.println();

        //4,通过Document对象调用elements()方法获取子目录的Element对象的集合
        List<Element> elements = rootElement.elements();
        for (Element element : elements) {
            System.out.println(element.getName());
        }
        System.out.println();
        //5,通过Document对象调用elements("子目录名称")方法获取指定子目录的Element对象的集合
        List<Element> elements1 = rootElement.elements("user");
        for (Element element : elements1) {
            System.out.println(element.getName());
        }

    }
}
