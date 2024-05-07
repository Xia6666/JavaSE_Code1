package service;

import dao.UserDao;
import pojo.User;

public class UserManager {
    private final UserDao userDao=new UserDao();

    public boolean judgeUserName(String name) {
        return userDao.judgeUserName(name) != -1;
    }
    public boolean judgeUser(String name,String pwd)
    {
        int index = userDao.judgeUserName(name);
        return  userDao.judgeUserPwd(pwd, index);//返回一个boolean值用于判断密码是否正确！
    }

    public boolean registerUser(String name,String pwd)
    {
        return userDao.registerUser(new User(name,pwd));
    }

}
