package com.itheima.stream01.test01;

import java.util.*;

public class Test10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Student> students=new ArrayList<>();
        ArrayList<String> adr=new ArrayList<>();
        TreeMap<Student,String> treeMap=new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge()-o1.getAge();
            }
        });
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第"+(i+1)+"个学生的姓名：");
            String name=scanner.next();
            System.out.println("请输入第"+(i+1)+"个学生的年龄：");
            int age=scanner.nextInt();
            students.add(new Student(name,age));
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第"+(i+1)+"个学生居住地：");
            String ad=scanner.next();
            adr.add(ad);
        }

        for (int i = 0; i < 3; i++) {
            treeMap.put(students.get(i),adr.get(i));
        }
        treeMap.keySet().stream().filter(s->s.getName().startsWith("张")).forEach(s->System.out.println("学生信息："+s+",对应的居住地是："+treeMap.get(s)));


    }

}
class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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
        Student student = (Student) object;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
