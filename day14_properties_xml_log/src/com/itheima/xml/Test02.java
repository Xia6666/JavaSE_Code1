package com.itheima.xml;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
* - 将所有姓**刘**的学生封装进List集合中，并遍历输出**男**学生信息。
- 将所有老师封装进List集合中，然后过滤出年龄30岁及以下的老师并封装进Map集合中，k
* ey为position职位，value为老师姓名，并遍历输出Map集合*/
public class Test02 {
    public static void main(String[] args) throws Exception{
        SAXReader saxReader=new SAXReader();
        Document document = saxReader.read("day14_properties_xml_log/src/com/itheima/xml/test.xml");
        Element rootElement = document.getRootElement();
        List<Student01> student01s = rootElement.elements("student").
                stream().filter(element -> element.elementText("name").startsWith("刘")).map(s ->
                        new Student01(s.elementText("name"), s.elementText("sex"), s.elementText("email"))

                ).collect(Collectors.toList());
        student01s.stream().filter(s->s.getSex().equals("男")).forEach(System.out::println);

        Map<String, String> teachers = rootElement.elements("teacher").stream().filter(s -> Integer.parseInt(s.elementText("age")) <= 30).map(s -> new
                Teacher01(s.attributeValue("position"), s.elementText("name"), s.elementText("sex"), Integer.valueOf(s.elementText("age")))
        ).collect(Collectors.toMap(Teacher01::getPosition, Teacher01::getName));
        System.out.println(teachers);


    }
}
class Teacher01{
    private String position;
    private String name;
    private String sex;
    private Integer age;

    public Teacher01() {
    }

    public Teacher01(String position, String name, String sex, Integer age) {
        this.position = position;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "position='" + position + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
class Student01
{
    private String name;
    private String sex;
    private String email;

    public Student01() {
    }

    public Student01(String name, String sex, String email) {
        this.name = name;
        this.sex = sex;
        this.email = email;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}




