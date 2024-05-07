package com.itheima.controller;

import com.itheima.service.UserService;

import java.util.Scanner;

import com.itheima.pojo.User;

public class UserController {
//客服类，接收请求参数
    //传递给业务员干活
    //反馈给用户
   private final Scanner scanner =new Scanner(System.in);
   private final UserService userService=new UserService();
    public void start() {

        System.out.println("========欢迎进入学生管理系登陆界面=======");
        System.out.println("1,用户登陆");
        System.out.println("2,用户注册");
        System.out.println("3,退出系统");

        System.out.println("请选择：");
        int n = scanner.nextInt();

        switch (n)
        {
            case 1:
                judgeUser();
                return;
            case 2:
                registerUser();
                start();
                break ;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("输入有误！");
        }


    }
    private void registerUser()
    {
        while (true)
        {
            System.out.print("请输入您的想要注册的账号：");
            String registerName = scanner.next();
            boolean b=userService.getExistUserName(registerName);
            if(!b)
            {
                System.out.print("请输入您要设置的密码：");
                String registerPws=scanner.next();
                userService.registerUser(new User(registerName,registerPws));
                System.out.println("恭喜你注册成功！！！");
                return;
            }
            else
                System.out.println("账号重复！请重新输入一个账号！");
        }

    }

    private void judgeUser()
    {
        while (true)
        {
            System.out.print("请输入您的账号：");
            String userName = scanner.next();

            boolean b=userService.getExistUserName(userName);
            if(b)
            {
                for (int i = 1; i <=3; i++)
                {
                    System.out.print("请输入您的密码：");
                    String pws = scanner.next();

                    boolean a=userService.detectPws(new User(userName,pws));
                    if(a)
                    {
                        System.out.println("登陆成功！！");
                        return;
                    }
                    else
                        System.out.println("密码不正确！还剩"+(3-i)+"次机会！");
                }
                System.out.println("密码错误过多！");
                return;
            }
            else
                System.out.println("账号不正确！");
        }

    }

}
