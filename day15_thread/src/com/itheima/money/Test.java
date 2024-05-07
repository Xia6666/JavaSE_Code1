package com.itheima.money;

public class Test {
    public static void main(String[] args) {
        Account account = new Account();
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
