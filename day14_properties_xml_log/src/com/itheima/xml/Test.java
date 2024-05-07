package com.itheima.xml;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws Exception{
        ArrayList<Student> students=new ArrayList<>();
        ArrayList<Teacher> teachers=new ArrayList<>();
        Map<String,String> hashMap=new HashMap<>();
        SAXReader saxReader=new SAXReader();
        Document document = saxReader.read("day14_properties_xml_log/src/com/itheima/xml/test.xml");
        Element root = document.getRootElement();
        List<Element> elements = root.elements();
        for (Element element : elements) {
            if(element.getName().equals("student")&&element.elementText("name").startsWith("刘"))
            {
                students.add(new Student(element.elementText("name"),element.elementText("sex"),element.elementText("email")));
            }
            if(element.getName().equals("teacher"))
            {
                teachers.add(new Teacher(element.attributeValue("position"),element.elementText("name"),element.elementText("sex"),Integer.valueOf(element.elementText("age"))));
            }
        }
        for (Student student : students) {
            if(student.getSex().equals("男"))
                System.out.println(student);
        }

        for (Teacher teacher : teachers) {
            if (teacher.getAge()<=30) {
                hashMap.put(teacher.getPosition(),teacher.getName());
            }
        }

        hashMap.forEach((k,v)-> System.out.println(k+"="+v));



    }
}
class Student{
    private String name;
    private String sex;
    private String email;

    public Student() {
    }

    public Student(String name, String sex, String email) {
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
class Teacher{
    private String position;
    private String name;
    private String sex;
    private Integer age;

    public Teacher() {
    }

    public Teacher(String position, String name, String sex, Integer age) {
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
