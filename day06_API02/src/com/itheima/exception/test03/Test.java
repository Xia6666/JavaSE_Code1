package com.itheima.exception.test03;

import java.util.Scanner;

public class Test {
    private static AtmService atmService=new AtmService();
    public static void main(String[] args) {
        System.out.println("请输入取钱的金额：");
        Scanner scanner=new Scanner(System.in);
        int money = scanner.nextInt();
        try {
            int num=atmService.getMoney(money);
            System.out.println("取款成功！余额还剩："+num);
        } catch (AtmException e) {
            System.out.println(e.getMessage());
        }

    }
}
class AtmService{
    private final AtmDao atmDao=new AtmDao();

    public int getMoney(int money) throws AtmException {
        if(money<0)
        {
            throw new AtmException("取钱金额不合法！");
        }
        if(money>atmDao.getMoney())
        {
            throw new AtmException("余额不足！");

        }
        else
        {
            atmDao.setMoney(money);

        }
        return atmDao.getMoney();

    }

}

class  AtmDao{

    private int money=10000;

    public int getMoney()
    {
        return money;
    }

    public void setMoney(int money1)
    {
       money=money-money1;
    }
}

class AtmException extends Exception{
    public AtmException() {
    }

    public AtmException(String message) {
        super(message);
    }
}
