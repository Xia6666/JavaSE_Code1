package com.itheima.threadPool;

import java.util.concurrent.*;

public class Demo01 {
    public static void main(String[] args) {
        //第一种不建议的创建线程池的方式
        //这些创建线程的方式，要么没有限制线程的数量，要么没有限制队列的长度。很容易出现Out of memory（内存溢出异常）
        ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorService1=Executors.newSingleThreadExecutor();
       // Executors.newFixedThreadPool()

        //第二中，自定义线程池的创建
        ThreadPoolExecutor tp=new ThreadPoolExecutor(9,     //创建的核心线程数
                18,                                                      //创建的最大线程数，临时线程数=最大线程数-核心线程数
                10,                                                      //临时线程的持续多长时间
                TimeUnit.SECONDS,                                        //时间的单位，通过TimeUnit枚举类来选择单位
                new ArrayBlockingQueue<Runnable>(10),           //核心线程满了的时候，需要将线程存放的队列等待
                Executors.defaultThreadFactory(),                       //线程创建工厂
                new ThreadPoolExecutor.AbortPolicy());                  //拒绝策略

        //核心线程数量如何决定：
        //如果是cpu密集型（就是任务对计算要求较高）：一般核心线程数是cpu核心加一，n+1.
        //如果是IO密集型（又称IO阻塞型）：一般核心线程数是cpu核心的两倍，2n。


    }
}
