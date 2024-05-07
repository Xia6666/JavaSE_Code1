package com.itheima;

import java.util.ArrayList;

/*
* notifyAll:会唤醒所有线程进入到就绪状态
* notify：会唤醒随机的一个进程进入的就绪状态
* wait:会让当前线程进入无限制休眠状态，并且释放锁，
* sleep：会让当前线程进入有限的休眠状态，休眠结束继续进入运行状态不会释放锁
*
*
* */

public class Test05 {
    public static void main(String[] args) {
        Store store=new Store();
        new Thread(() -> {while (true) store.creat();},"生产者1").start();
        new Thread(() -> {while (true) store.creat();},"生产者2").start();
        new Thread(() -> {while (true) store.creat();},"生产者3").start();

        new Thread(()->{while(true) store.eat();},"消费者1").start();
        new Thread(()->{while(true) store.eat();},"消费者2").start();

    }

    private static class Store{
        ArrayList<String> arrayList=new ArrayList<>(1);

        public synchronized void creat()
        {
            if(arrayList.isEmpty()){
                try {
                System.out.println(Thread.currentThread().getName()+"开始制作包子！！！");
                Thread.sleep(1000);
                arrayList.add((Thread.currentThread().getName()+"做好的包子！"));

               this.notifyAll();
               this.wait();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            else {
                try {
                this.notifyAll();
                  this.wait();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }

        public synchronized void eat(){
            if(arrayList.size()==1)
            {
                try {
                System.out.println(Thread.currentThread().getName()+"抢到了"+arrayList.get(0)+"做的包子，开始吃。。。。");
                Thread.sleep(1000);
                arrayList.clear();
                System.out.println(Thread.currentThread().getName()+"已经吃完包子了");
               this.notifyAll();
                   this.wait();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
            else {
                try {
                this.notifyAll();
                   this.wait();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }

    }
}
