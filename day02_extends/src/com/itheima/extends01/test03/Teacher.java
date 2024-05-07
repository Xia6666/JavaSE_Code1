package com.itheima.extends01.test03;

public class Teacher extends Person {

    public Teacher(String id,String name,int age,String birthday)
    {
        super(id,name,age,birthday);
    }

    public Teacher() {
    }

    @Override
    public void show()
    {

        System.out.println("老师的工号："+super.getId()+"，老师的姓名："+super.getName()+"，老师的年龄："+super.getAge()+"，老师的生日："+super.getBirthday());
    }

}
