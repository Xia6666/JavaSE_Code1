package com.xiaqe.service;

import com.xiaqe.dao.UserDao;
import com.xiaqe.pojo.User;

public class UserManager implements UserBaseManager{
    private final UserDao userBaseDaoDao=new UserDao();

    public boolean isExistName(String name) {
        return userBaseDaoDao.isExistName(name);
    }


    public boolean judgment(String userName,String pws) {
        return userBaseDaoDao.judgment(new User(userName,pws));
    }


    public void addUser(String userName,String pws) {
        userBaseDaoDao.addUser(new User(userName,pws));
    }


    public boolean changePws(String name, String pws) {
        return userBaseDaoDao.changePws(name, pws);
    }

}
