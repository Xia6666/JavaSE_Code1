package dao;

import pojo.User;

import java.util.LinkedList;

public class UserDao {
    private static final LinkedList<User> list=new LinkedList<>();
    static {
        list.add(new User("xqe","020210"));
        list.add(new User("wyn","030109"));
    }
    public int judgeUserName(String name)  //判断是否含有该用户名
    {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getUserName().equals(name))
            {
                return i;
            }
        }
        return -1;
    }
    public boolean judgeUserPwd(String pwd,int index)  //判断密码是否对
    {
        return list.get(index).getUserPwd().equals(pwd);
    }

    public boolean registerUser(User user)  //添加注册新用户
    {
        return list.add(user);
    }


}
