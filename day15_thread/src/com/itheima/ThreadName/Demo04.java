package com.itheima.ThreadName;

import java.util.UUID;

public class Demo04 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        }, "Thread-run1-" + UUID.randomUUID());
        thread1.start();
        Thread thread2 = new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        },"Thread-run2-"+ UUID.randomUUID());
        thread2.start();
        Thread thread3 =new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        },"Thread-run3-"+ UUID.randomUUID());
        thread3.start();


      /*  thread1.start();
        thread2.start();
        thread3.start();*/
       Thread.currentThread().setName("ThreadMain-"+UUID.randomUUID());
        System.out.println(Thread.currentThread().getName());
    }
}
