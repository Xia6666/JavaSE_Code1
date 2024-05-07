package com.itheima.controller;
/*
* 和用户交互的类（接受请求，调用service去处理)
* */


import com.itheima.service.UserService;

import java.util.Scanner;

public class UserController {
    private final Scanner scanner=new Scanner(System.in);
    private final UserService userService=new UserService();


    public void start()
    {
        out: while (true)
        {
            System.out.println("==========欢迎进入学生管理系统========");
            System.out.println("1,登陆系统");
            System.out.println("2,注册账户");
            System.out.println("3,退出系统");

            int n=scanner.nextInt();

            switch (n)
            {
                case 1:
                    if(userService.login())
                        break out;
                    else
                        break;

                case 2:
                   userService.addUser();
                    break;

                case 3:
                    System.out.println("欢迎下次使用！");
                    System.exit(0);

                default:
                    System.out.println("指令有误！");
            }

        }
        //2，进入学生管理系统
        System.out.println("恭喜你成功登陆系统！！！");


    }

}
