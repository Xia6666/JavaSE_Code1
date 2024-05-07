package com.itheima;

public class Test04 {
    /**
     * 假设有一个电影院，有100张电影票，售票窗口有两个售票员在售票。多个顾客同时来购买电影票，每个顾客购买1张电影票。
     *
     * 编写一个 Java 程序，模拟电影院的售票系统，要求实现以下功能：
     *
     * 1. 使用多线程模拟售票员售票过程，每个售票员在售票时需要考虑票数是否充足，如果票数不足则停止售票。
     * 2. 多个顾客同时购买电影票，每个顾客购买一张电影票，售票员在售票过程中需要考虑线程安全性，防止多个顾客同时购买同一张电影票。
     *
     * 提示：可以使用 `synchronized` 关键字或`Lock`锁来保证多个售票员在售票时的线程安全性；可以使用 `Thread.sleep()` 方法来模拟顾客购票的时间间隔。
     *
     * 这个题目涉及到实际的售票场景，考察了多线程编程中的同步与互斥，以及线程安全性的处理。
     */

        public static void main(String[] args) {
            Cinema cinema = new Cinema(100);//电影院限售100张票
            new Thread(() -> {
                for (int i = 1; i <= 100; i++) {//模拟1号窗口排队100人
                    cinema.sellTicket(1);
                }
            }, "1号窗口").start();

            new Thread(() -> {
                for (int i = 1; i <= 50; i++) {//模拟2号窗口排队50人
                    cinema.sellTicket(1);
                }
            }, "2号窗口").start();
        }

        /**
         * 电影院
         */
        public static class Cinema {
            //余票
            private int ticketCnt;

            public Cinema(int ticketCnt) {
                this.ticketCnt = ticketCnt;
            }

            public Cinema() {
            }

            /**
             * 售票程序
             * @param bugCnt 每名顾客购票张数
             */
            public void sellTicket(int bugCnt) {
                System.out.println(Thread.currentThread().getName() + "开始售票！等待顾客选择影片！");
                synchronized (this) {//加锁，保证不会超售（一张票，只能被一个顾客购买）
                    if ( ticketCnt == 0) {
                        System.out.println(Thread.currentThread().getName() + "余票不足！当前剩余" + ticketCnt + "张票！");
                        return;
                    }
                    try {
                        System.out.println(Thread.currentThread().getName() + "出票中...请稍后");
                        Thread.sleep(1000);//模拟购票间隔时间
                        ticketCnt -= bugCnt;
                        System.out.println(Thread.currentThread().getName() + "售出" + bugCnt + "张票，剩余" + ticketCnt + "张票！");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }


