package com.itheima.xml;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.ArrayList;
import java.util.List;

public class Demo02 {
    public static void main(String[] args) throws Exception{
        List<User> users=new ArrayList<>();

        //1,首先创建一个SAXReader对象
        SAXReader saxReader=new SAXReader();
        //2,通过read方法将xml文件倒入，并且封装表单对象Document对象
        Document document = saxReader.read("day14_properties_xml_log/src/com/itheima/xml/user.xml");
        //3,通过document对象获取第一个Element对象——root(根标签对象）
        Element root = document.getRootElement();
        //4,通过根标签的element对象在调用elements()方法获取所有子标签的element对象并存放在集合中
        List<Element> elements = root.elements();
        //5,遍历所有子标签并且调用字标签的elementText()方法获取子标签中对应的字面值，并且存放在对象中
        for (Element element : elements) {
            users.add( new User(element.elementText("name"),
                    element.elementText("password"),
                    Integer.valueOf(element.elementText("age"))));
        }

        System.out.println(users);
    }
}
class User{
    private String name;
    private String pws;
    private Integer age;

    public User() {
    }

    public User(String name, String pws, Integer age) {
        this.name = name;
        this.pws = pws;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pws='" + pws + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPws() {
        return pws;
    }

    public void setPws(String pws) {
        this.pws = pws;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
