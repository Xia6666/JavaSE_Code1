package dao;

import pojo.User;

import java.util.HashMap;
import java.util.LinkedList;

public class HashMapUserDao {
    private static final HashMap<String,String> hashMap=new HashMap<>();
    static {
        hashMap.put("xqe","020210");
        hashMap.put("wyn","030109");
    }
    public boolean judgeUserName(String name)  //判断是否含有该用户名
    {
       return hashMap.containsKey(name);
    }
    public boolean judgeUserPwd(String name,String pwd)  //判断密码是否对
    {
        return hashMap.get(name).equals(pwd);
    }

    public void registerUser(String name,String pwd)  //添加注册新用户
    {
        hashMap.put(name,pwd);
    }


}
