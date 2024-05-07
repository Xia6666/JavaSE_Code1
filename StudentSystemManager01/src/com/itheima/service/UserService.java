package com.itheima.service;

import com.itheima.dao.UserDao;
import com.itheima.pojo.User;

public class UserService {
  private final UserDao userDao=  new UserDao();


    public boolean getExistUserName(String userName) {
        for (int i = 0; i < userDao.getArrayList().size(); i++) {
            if(userDao.getArrayList().get(i).getUserName().equals(userName))
                return true;
        }
        return false;
    }

    public boolean detectPws(User user) {
        for (int i = 0; i < userDao.getArrayList().size(); i++) {
            if(userDao.getArrayList().get(i).getUserPws().equals(user.getUserPws()))
                return true;
        }
        return false;
    }

    public void registerUser(User user) {
        userDao.registerUser(user);
    }
}
