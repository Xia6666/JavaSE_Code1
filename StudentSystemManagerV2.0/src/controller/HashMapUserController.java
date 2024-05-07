package controller;

import service.HashMapUserManager;

import java.util.Scanner;

public class HashMapUserController {
    private final HashMapUserManager hashMapUserManager =new HashMapUserManager();
    private final Scanner scanner=new Scanner(System.in);
    public void start()
    {
        System.out.println("==============欢迎来到学生管理系统登陆界面===========");
        System.out.println("1,用户登陆");
        System.out.println("2,新用户注册");
        System.out.print("请选择：");
        while (true) {
            int choice;
            while (true)            //处理用户输入的不是整数的异常！
            {
                try {
                    Scanner scanner1 = new Scanner(System.in);
                    choice = scanner1.nextInt();
                    break;
                } catch (Exception e) {
                    System.err.println("输入不合法！请重新输入一个整数：");
                    ;
                }
            }
            switch (choice) {
                case 1:
                    if(Longin()) return;
                    else System.exit(0);
                case 2:
                    registerUser();
                    if(Longin()) return;
                    else start();
                default:
                    System.out.println("请输入正确的整数(1or2)!");
            }
        }
    }

    private boolean Longin()
    {
        String name;
        System.out.println("请输入用户名：");
        while (true) {
            name = scanner.next();
            if (hashMapUserManager.judgeUserName(name))
                break;
            else
                System.out.print("该用户名不存在！请重新输入：");
        }
        System.out.println("请输入密码：");
        for (int i = 2; i>=0; i--)
        {
            String pwd=scanner.next();
            if(hashMapUserManager.judgeUser(name,pwd))
            {
                System.out.println("恭喜用户"+name+"登陆成功！");
                return true;
            }
            System.out.println("密码不正确!还有"+i+"次机会！");
        }
        System.out.println("登陆失败！密码错误次数太多！");
        return false;
    }


    private void registerUser() {
        System.out.println("请输入你要注册的用户名：");
        String name;
        while (true){
           name=scanner.next();
            if (!hashMapUserManager.judgeUserName(name)) {
                break;
            }
            else
                System.out.println("该用户名已经被注册了，请重新输入用户名:");
        }
        System.out.println("请输入你的密码：");
        String pwd = scanner.next();
        hashMapUserManager.registerUser(name,pwd);
        System.out.println("恭喜你注册成功！请重新登陆！");
    }

}
