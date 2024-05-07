package com.itheima.base;

public class Demo01 {
    //1,在main方法中的都是属于主线程的
    //2，调用子线程中的方法应该是调用start()方法，
    //3，当主线程调用了start()方法后，子线程会在就绪状态等待，等待cpu分配时间
    public static void main(String[] args) throws Exception{
        MyThread myThread01=new MyThread("线程一");
        MyThread myThread02=new MyThread("线程二");
        MyThread myThread03=new MyThread("线程三");
        MyThread myThread04=new MyThread("线程四");
        MyThread myThread05=new MyThread("线程五");

        myThread01.start();
        myThread02.start();
        myThread03.start();
        myThread04.start();
        myThread05.start();
       System.out.println("main--w我也执行了！！！");
        System.out.println("main-我先执行了！！！");
    }

    public static class MyThread extends Thread{
        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {

                System.out.println(super.getName()+"执行了！！！");


        }
    }
}
