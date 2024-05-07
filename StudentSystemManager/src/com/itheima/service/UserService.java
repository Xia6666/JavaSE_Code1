package com.itheima.service;

import com.itheima.dao.UserDao;
import com.itheima.pojo.User;

import java.util.Scanner;


/*
* 用于存放业务层的逻辑代码
*
* */
public class UserService {
private final Scanner scanner=new Scanner(System.in);
private final UserDao userDao=new UserDao();

    public  boolean login() {
        //1,提示用户输入用户名和密码
        System.out.println("请输入用户名：");
        String name = scanner.next();
        System.out.println("请输入密码：");
        String psd = scanner.next();

        boolean flag=false;

        for (int i = 0; i < userDao.getUsers().size(); i++) {
            if(name.equals(userDao.getUsers().get(i).getUseName()) && psd.equals(userDao.getUsers().get(i).getPwd()))
            {
                flag=true;
                break;
            }
        }

        if(flag)
        {
            System.out.println("恭喜登陆成功！");
            return flag;
        }
        else {
            System.out.println("用户名或者密码错误！");
            return flag;
        }

    }


    public  void addUser() {

        System.out.print("请输入注册的用户名：");
        String username = scanner.next();

        for (int i = 0; i < userDao.getUsers().size(); i++) {
            if(userDao.getUsers().get(i).getUseName().equals(username))
            {
                System.out.println("用户名被占用!");
                addUser();
            }
        }
        System.out.print("请输入注册的密码：");
        String psd = scanner.next();

        userDao.addUsers(new User(username, psd));
        System.out.println("恭喜你注册成功！");
    }


}
