package com.itheima.extends01.Test05;

public class BaseTeacher extends Teacher{
    public BaseTeacher() {
    }

    public BaseTeacher(String name, int age) {
        super(name, age);
    }
    @Override
    public void teach()
    {
        System.out.println("基础班老师讲JavaSE");
    }
}
