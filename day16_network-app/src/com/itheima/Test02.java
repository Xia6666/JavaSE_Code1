package com.itheima;

import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test02 {
    public static void main(String[] args) {
        Store store = new Store();
        ThreadPoolExecutor executor=new ThreadPoolExecutor(5,10,30, TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(10),new ThreadPoolExecutor.AbortPolicy());
        executor.execute(new Runnable() {
            @Override
            public void run() {
                while (true)
                     store.create();
            }
        });executor.execute(new Runnable() {
            @Override
            public void run() {
                while (true)
                 store.create();
            }
        });executor.execute(new Runnable() {
            @Override
            public void run() {
                while (true)
                 store.create();
            }
        });executor.execute(new Runnable() {
            @Override
            public void run() {
                while (true)
                    store.eat();
            }
        });executor.execute(new Runnable() {
            @Override
            public void run() {
                while (true)
                 store.eat();
            }
        });
    }
    private static class Store{
        private String bread;
        public synchronized void create()
        {

            if(Objects.equals(bread,null))
            {
                try {
                Thread thread=Thread.currentThread();
                System.out.println(thread.getName()+"开始制作面包！！！");
                Thread.sleep(1000);
                bread=thread.getName()+"制作的面包";
                System.out.println(thread.getName()+"已经制作好了面包了！");
                this.notifyAll();
                   this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            else {
                this.notifyAll();
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        public synchronized void eat()
        {
            if(!Objects.equals(bread,null))
            {
                System.out.println(Thread.currentThread().getName()+"开始吃面包");
                try {
                    Thread.sleep(1000);
                    bread=null;
                    System.out.println(Thread.currentThread().getName()+"吃完了面包了！");
                    this.notifyAll();
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            else {
                this.notifyAll();
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        }




    }


}
