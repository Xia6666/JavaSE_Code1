package com.xiaqe.dao;

import com.xiaqe.pojo.User;

public interface UserBaseDao {

    //查询集合中是否包含某个该用户名
    boolean isExistName(String name);

    //查询集合中密码和用户名符不符合
    boolean judgment(User user);

    //添加新用户
    void addUser(User user);

    //修改密码
    boolean changePws(String name,String pws);

}
