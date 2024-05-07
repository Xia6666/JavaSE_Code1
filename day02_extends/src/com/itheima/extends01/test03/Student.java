package com.itheima.extends01.test03;

public class Student extends Person{

    public Student() {
    }

    public Student(String id, String name, int age, String birthday)
    {
        super(id,name,age,birthday);
    }
    public void show()
    {

            System.out.println("学生的工号："+super.getId()+"，学生的姓名："+super.getName()+"，学生的年龄："+super.getAge()+"，学生的生日："+super.getBirthday());
    }

}
