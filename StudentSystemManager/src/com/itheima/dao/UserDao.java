package com.itheima.dao;

import com.itheima.pojo.User;

import java.util.ArrayList;

/*
*
* 管理数据的类，涉及到数据的操作应该放在dao类中
* */
public class UserDao {
    private static final ArrayList<User> users=new ArrayList<>();

    static {
        users.add(new User("zhangsan","123456"));
        users.add(new User("lisi","13579"));
    }

    public void addUsers(User user)
    {
        users.add(user);
    }

    public ArrayList<User> getUsers()
    {
        return users;
    }

}
