package com.itheima.base;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Demo03 {
    public static void main(String[] args) throws Exception{

        long l = System.currentTimeMillis();
        MyCallable myCallable=new MyCallable();
        FutureTask<Long> futureTask=new FutureTask<>(myCallable);
        Thread thread=new Thread(futureTask);
        thread.start();

         MyCallable myCallable1=new MyCallable(futureTask.get());
        FutureTask<Long> futureTask1=new FutureTask<>(myCallable1);
        Thread thread1=new Thread(futureTask1);
        thread1.start();

        System.out.println("主线程执行1");
        System.out.println(futureTask1.get());
        System.out.println("主线程执行2");
        System.out.println("总耗时："+(System.currentTimeMillis()-l));
    }
}
class MyCallable implements Callable<Long> {
    long a;

    public MyCallable() {
    }

    public MyCallable(Long a) {
        this.a = a;
    }

    @Override
    public Long call() throws Exception {
        long sum = a;
        for (int i = 0; i < 1000000000; i++) {
            sum+=i;
        }
        return sum;
    }
}
class MyCallable1 implements Callable<Long> {
    long a;

    public MyCallable1(Long a) {
        this.a = a;
    }

    @Override
    public Long call() throws Exception {
        long sum = a;
        for (int i = 0; i < 1000000000; i++) {
            sum+=i;
        }
        return sum;
    }
}



