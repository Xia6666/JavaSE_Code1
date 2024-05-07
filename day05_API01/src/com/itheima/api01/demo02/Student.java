package com.itheima.api01.demo02;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*  @Override
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
*/
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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Student student1=new Student("张三",12);
        Student student2=new Student("张三",12);
        System.out.println(student1);
        System.out.println(student2.toString());
        //结论一：打印对象和打印对象的toString方法得到的效果一样！
        //结论二：默认打印出来的是地址值
        //结论三：需要重写toString方法来获取想要得到的打印值。


        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));
       //继承父类中的的equals是默认比较地址值的，所以需要重写来比较内容。
    }
}
