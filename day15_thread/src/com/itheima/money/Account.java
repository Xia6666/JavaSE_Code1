package com.itheima.money;

public class Account {
    private volatile int money=100000;
   public  void takeMoney(int money1) throws InterruptedException {
        if(money1<=money)
        {

            int m=money-money1;
            money=m;
            System.out.println(Thread.currentThread().getName()+"取钱成功！余额还剩"+money);

        }
        else {
            System.out.println(Thread.currentThread().getName()+"取钱失败");
        }

    }
}
