package com.itheima.synchronizedDemo;
/*
* 1,通过同步代码块来实现并发异常问题—————— synchronized (this){}实例方法 or  synchronized(类名.class){}静态方法
* 2,同步方法，在方法申明上加关键字。根据情况选择，因为加锁是会牺牲性能的，有些方法中不需要全部加锁时候就应该使用同步代码块
*
* */
public class Test {
    public static void main(String[] args) {
        Account01 account = new Account01();
        Thread thread1= new Thread(() -> {
            try {

                account.takeMoney(100000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"小红");
        Thread thread2= new Thread(() -> {
            try {
                account.takeMoney(100000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"小明");

        thread1.start();
        thread2.start();

    }
}
class Account01{
    private int money=100000;
    public  void takeMoney(int money1) throws InterruptedException {
        synchronized (this){
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
}

