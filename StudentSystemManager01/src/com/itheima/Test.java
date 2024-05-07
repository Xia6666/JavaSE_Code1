package com.itheima;

import com.itheima.controller.StudentController;
import com.itheima.controller.UserController;

public class Test {
    public static void main(String[] args) {
        //创建一个UserController对象用来调用start()方法
        UserController userController = new UserController();
        userController.start();

        StudentController studentController=new StudentController();
        studentController.start();
    }
}
