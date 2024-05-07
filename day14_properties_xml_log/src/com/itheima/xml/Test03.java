package com.itheima.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;
import java.util.stream.Collectors;

public class Test03 {
    public static void main(String[] args) throws Exception {
        //1，首先创建一个SAXReader对象
        SAXReader reader=new SAXReader();
        //2，调用read()方法，里面传入xml文件的地址，加载返回一个document对象，document对线相当于整个表单对象
        Document document = reader.read("/Users/xiaquanen/IdeaProjects/JavaSE_Code_64/JavaSE_Code_64/day14_properties_xml_log/src/com/itheima/xml/contactList.xml");
        //3，通过调用getRootElement()方法返回根标签的Element对象，因为根标签对象只有一个，所以不用返回集合
        Element root = document.getRootElement();
        //4，通过根标签对象调用elements()方法返回各个字标签对象的集合，当然也可以指定属性返回子标签的对象。其中element方法返回第一个指定属性的子标签的对象
        List<Element> elements = root.elements();
        //5，通过对字标签的对象集合进行遍历，调用elementText方法返回子标签中的文本属性值
        List<Person> persons= elements.stream().map(e -> new Person(e.attributeValue("id"), e.elementText("name"), e.elementText("gender"), e.elementText("email"))).collect(Collectors.toList());

        for (Person person : persons) {
            System.out.println(person);
        }

    }
}
class Person{
    private String id;
    private String name;
    private String sex;
    private String email;

    public Person() {
    }

    public Person(String id, String name, String sex, String email) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
