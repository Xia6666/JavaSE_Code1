package com.itheima.dao;

import com.itheima.pojo.User;

import java.util.ArrayList;

public class UserDao {

    private static ArrayList<User> arrayList=new ArrayList<>();

static {
    arrayList.add(new User("zhangsan","13579"));
    arrayList.add(new User("lisi","24680"));
}

    public ArrayList<User> getArrayList() {
        return arrayList;
    }

    public void registerUser(User user)
{
    arrayList.add(user);

}

}
