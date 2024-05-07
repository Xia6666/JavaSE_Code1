package com.itheima.ThreadName;

import java.util.UUID;

public class Demo05 {
    public static void main(String[] args) throws InterruptedException {
        //1,可以以通过线程的静态方法获取当前线程对象Thread.currentThread()
        //2,可以通过setName()修改线程名字
        //3,getName()获取名字
        //4,join(),谁先调用谁先执行，相当于插队的功能
        //5,join()方法不能乱用，否则会使其它线程出现阻塞状态。
        //6，当两个线程需要有先后顺序关系时候，可以加入两个join方法，改变顺序，使用一个join不靠谱的
        Thread thread1=new Thread(new MyRunnable(),"1-");
        thread1.start();
        Thread thread2=new Thread(new MyRunnable(),"2-");
        thread2.start();
        thread2.join();



        Thread thread3=new Thread(new MyRunnable(),"3-");

        thread3.start();
        System.out.println(Thread.currentThread().getName());

    }

}
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread-run"+Thread.currentThread().getName());
        }

    }
}
