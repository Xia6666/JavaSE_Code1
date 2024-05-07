package com.itheima;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test03 {
    public static void main(String[] args) {
        TicketSale ticketSale=new TicketSale();
        ThreadPoolExecutor executor=new ThreadPoolExecutor(2,5,30, TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(1), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        executor.execute(()->{for (int i = 0; i < 110; i++) {
            ticketSale.getTicket(1);}
        }); executor.execute(()->{for (int i = 0; i < 110; i++) {
            ticketSale.getTicket(1);}
        }); executor.execute(()->{for (int i = 0; i < 110; i++) {
            ticketSale.getTicket(1);}
        }); executor.execute(()->{for (int i = 0; i < 110; i++) {
            ticketSale.getTicket(1);}
        }); executor.execute(()->{for (int i = 0; i < 110; i++) {
            ticketSale.getTicket(1);}
        }); executor.execute(()->{for (int i = 0; i < 110; i++) {
            ticketSale.getTicket(1);}
        });


/*        Thread thread01=new Thread(()->
        {
            for (int i = 0; i < 50; i++) {
                ticketSale.getTicket(1);
            }
        },"售票员1");

        Thread thread02=new Thread(()->
        {
            for (int i = 0; i < 60; i++) {
                ticketSale.getTicket(1);
            }
        },"售票员2");

        thread01.start();
        thread02.start();*/

    }
    private static class TicketSale{
       private int ticket=100;
       public void getTicket(int n) {
           System.out.println(Thread.currentThread().getName()+"的顾客开始选票");
           synchronized (this) {
               if (ticket == 0) {
                   System.out.println("票已经卖完，停止售票!");
                   return;
               }
               try {
                   Thread.sleep(1000);
                   ticket -= n;
                   System.out.println(Thread.currentThread().getName() + "售票成功售出一张，还剩" + ticket);
               } catch (Exception e) {
                   throw new RuntimeException(e);
               }
           }
           }
       }
       }





