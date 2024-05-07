package com.xiaqe.service;

import com.xiaqe.dao.UserBaseDao;

public interface UserBaseManager {

    boolean isExistName(String name);
    boolean judgment(String userName,String pws);
    void addUser(String userName,String pws);
    boolean changePws(String name, String pws);





}
