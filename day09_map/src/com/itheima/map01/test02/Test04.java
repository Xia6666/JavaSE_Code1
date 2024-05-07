package com.itheima.map01.test02;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

public class Test04 {
    public static void main(String[] args) {

        TreeMap<Student,String> treeMap=new TreeMap<>( (o1, o2) -> o2.getAge()-o1.getAge() );
        treeMap.put(new Student("张三",18),"北京");
        treeMap.put(new Student("李四",20),"上海");
        treeMap.put(new Student("王五",35),"天津");
        treeMap.put(new Student("赵六",21),"北京");
        treeMap.put(new Student("田七",19),"上海");

        Set<Student> students = treeMap.keySet();
        Student student1=null;
        for (Student student : students) {
            if (student.getName().equals("张三"))
               student1=student;
            if(student.getName().equals("李四"))
                treeMap.put(student,"郑州");
        }
        treeMap.remove(student1);
        System.out.println("方式一   键找值");
        treeMap.keySet().forEach(s-> System.out.println(s.getAge()+"岁的"+s.getName()+"--"+treeMap.get(s)));
        System.out.println("=============");

        System.out.println("方式三   接口中默认的forEach方法配合lambda");
        treeMap.forEach((k,v)-> System.out.println(k.getAge()+"岁的"+k.getName()+"--"+v));

    }
}
class Person{
    private  String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object object) {

        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Person person = (Person) object;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
