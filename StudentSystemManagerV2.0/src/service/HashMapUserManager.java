package service;
import dao.HashMapUserDao;

public class HashMapUserManager {
    private final HashMapUserDao hashMapUserDao=new HashMapUserDao();

    public boolean judgeUserName(String name) {
        return hashMapUserDao.judgeUserName(name);
    }
    public boolean judgeUser(String name,String pwd)
    {
       return hashMapUserDao.judgeUserPwd(name,pwd);
    }

    public void registerUser(String name,String pwd)
    {
        hashMapUserDao.registerUser(name,pwd);
    }

}
