package com.itheima.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
* JDK1.6之后Lock锁和 synchronized性能已经一样了，用哪个都一样，但是Lock锁需要关闭，所以相对来说比较麻烦
*
* 线程不安全的一个最主要的原因是，线程无法直接操作堆内存中的数据，需要将数据复制一个副本回栈内存进行操作，当数据操作完后，需要将数据重新刷回堆内存中
* 也就是更新数据，这其中如果有其他线程也进来操作，第一个线程修改后的数据没有被更新，所以会导致线程不安全，也就是线程与线程之间不可见
* 通过加synchronized或者Lock可以保证原子性，也就是cpu不把这部分代码执行完不许切换到其它线程，也就是该部分代码不可再分了，这就是所谓的原子性
* 这样就会保证修改后的数据及时被更新，也就不会出现线程异常了，但是同样的也会影响效率。
*
* 总得来说，就是cpu是异步执行的，当有多线程时候，cpu会不断的在多个线程之间跳跃着执行，但是保证最后所有都会执行完！这也是多线程的核心，这其中有利也有弊
* 有利是充分利用cpu，提高效率，有弊是，每个线程之间的不可见性导致出现一些异常情况，解决方法就是在某些可能出现异常的时候让cpu同步执行，通过synchronized
* 或者Lock来锁住cpu不让其异步执行。
*
*
* */

public class Demo01 {
    public static void main(String[] args) {
        Account01 account01=new Account01();


        Thread thread1= new Thread(() -> account01.takeMoney(100000),"小明");
        Thread thread2= new Thread(() -> account01.takeMoney(100000),"小红");

        thread1.start();
        thread2.start();
    }
}
class Account01{

    private int money=100000;
    private Lock lock=new ReentrantLock();
    public  void takeMoney(int money1){
        lock.lock();
        try {
            if(money1<=money)
            {
                int m=money-money1;
                money=m;
                System.out.println(Thread.currentThread().getName()+"取钱成功！余额还剩"+money);
            }
            else {
                System.out.println(Thread.currentThread().getName()+"取钱失败");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }


        }
    }

