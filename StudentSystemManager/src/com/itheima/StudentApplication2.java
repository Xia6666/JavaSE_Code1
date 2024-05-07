package com.itheima;

import com.itheima.pojo.User;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApplication2 {
    private static Scanner scanner =new Scanner(System.in);
    private static ArrayList<User> users=new ArrayList<>();

    public static void main(String[] args) {
        users.add(new User("zhansan","13579"));
        users.add(new User("lisi","24680"));

       out1: while (true)
        {
            System.out.println("=======欢迎进入学生管理系统======");
            System.out.println("1,登陆系统");
            System.out.println("2,注册账户");
            System.out.println("3,退出系统");

            int n=scanner.nextInt();
            switch (n)
            {
                case 1:
                   if(login())
                   {
                       System.out.println("恭喜你登陆成功！");
                       break out1;
                   }else {
                       System.out.println("账户或者密码错误！");
                       break;
                   }

                case 2:
                    addUser();
                    break;
                case 3:
                    System.out.println("欢迎下次再见！");
                    System.exit(0);
                    break;

            }
        }
    }

    private static boolean login() {
        System.out.println("请输入用户名：");
        String name =scanner.next();

        System.out.println("请输入密码：");
        String pws =scanner.next();

        boolean flag=false;

        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getUseName().equals(name) && users.get(i).getPwd().equals(pws))
            {
                flag=true;
                break;
            }
        }
        if(flag)
            return flag;

        return flag;
    }

    public static void addUser()
    {
        System.out.println("请输入你所要注册的用户名：");
        String name=scanner.next();
        boolean flag=false;

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUseName().equals(name)) {
                flag=true;
            }
        }
        if(flag)
        {
            System.out.println("用户名重复！");
            addUser();
        }
        else{
            System.out.println("请输入你的密码：");
            String pwd=scanner.next();

            users.add(new User(name,pwd));

            System.out.println("恭喜你注册成功！");
        }
    }



}
