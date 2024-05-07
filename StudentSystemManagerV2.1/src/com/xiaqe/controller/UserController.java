package com.xiaqe.controller;

import com.xiaqe.service.UserManager;

import java.util.Scanner;

public class UserController {
    private  Scanner scanner=new Scanner(System.in);
    private final UserManager userManager =new UserManager();

    public void start()
    {
        System.out.println("=================欢迎进入学生管理系统V2.1用户登陆界面=================");
        while (true){
        System.out.println("1,用户登陆");
        System.out.println("2,新用户注册");
        System.out.println("3,忘记密码");
        System.out.println("请选择：");
        int choice;
        while (true)
        {
            try{
                choice=scanner.nextInt();
                break;
            }catch (Exception e)
            {
                System.err.println("输入不合法，请输入整数（1or2):");
                scanner=new Scanner(System.in);
            }
        }
        switch (choice)
        {
            case 1:
                if(login())
                {
                    System.out.println("恭喜您登陆成功！");
                    return;
                }
                else
                    System.out.println("密码错误次数太多！登陆失败！");
                break ;
            case 2:
               register();
                break ;
            case 3:
                changePws();
                break;
        }

    }
    }
    public boolean login()
    {
        System.out.println("请输入用户名：");
        String userName = scanner.next();
        while (!userManager.isExistName(userName)){
            System.out.println("用户不存在！请重新输入：");
            userName=scanner.next();
        }
        System.out.println("请输入密码：");
        String pws=scanner.next();
        for (int i = 2; i >0 ; i--) {
            if(userManager.judgment(userName,pws))
                return true;
            else
            {
                System.out.println("密码错误！！！还剩"+i+"次机会，请重新输入密码：");
                pws=scanner.next();
            }
        }
        return false;
    }

    public void register()
    {
        System.out.println("请输入要注册的用户名：");
        String userName=scanner.next();
        while (userManager.isExistName(userName)){
            System.out.println("用户名已存在！请重新输入：");
            userName=scanner.next();
        }
        System.out.println("请输入密码：");
        String pws=scanner.next();
        userManager.addUser(userName,pws);
        System.out.println("恭喜你注册成功！！！");
    }

    public void changePws()
    {
        System.out.println("请输入用户名：");
        String userName = scanner.next();
        while (!userManager.isExistName(userName)){
            System.out.println("用户不存在！请重新输入：");
            userName=scanner.next();
        }
        System.out.println("请输入修改后的密码：");
        String pws=scanner.next();
        while (!userManager.changePws(userName,pws))
        {
            System.out.println("修改失败！不能与原密码相同！请重新输入：");
            pws=scanner.next();
        }
        System.out.println("恭喜你密码修改成功！！！");
    }
}
