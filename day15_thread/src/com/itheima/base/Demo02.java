package com.itheima.base;

public class Demo02 {
    public static void main(String[] args) {
        Thread thread=new Thread(() -> System.out.println("子线程1执行了"));

        Thread thread1=new Thread(new MyRunnable(),"线程二");
        thread1.start();
        thread.start();
        System.out.println("主线程执行了");
    }
}
class MyRunnable implements Runnable{
    int a=2;
    @Override
    public void run() {
        a+=1;
        System.out.println("子线程2执行了");
        System.out.println(a++);
    }
}
