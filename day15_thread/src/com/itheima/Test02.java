package com.itheima;
import java.util.HashMap;
import java.util.concurrent.FutureTask;

public class Test02 {
    public static void main(String[] args) throws Exception{
        HashMap<Thread,FutureTask<Integer>> hashMap=new HashMap<>();
        long start = System.currentTimeMillis();
        int sum=1;
        FutureTask<Integer> count1 = count(3, 100000);
        Thread thread1=new Thread(count1);
        FutureTask<Integer> count2 = count(100000,200000);
        Thread thread2=new Thread(count2);
        FutureTask<Integer> count3 = count(200000, 300000);
        Thread thread3=new Thread(count3);
        FutureTask<Integer> count4 = count(300000, 400000);
        Thread thread4=new Thread(count4);
        FutureTask<Integer> count5 = count(400000, 500000);
        Thread thread5=new Thread(count5);
        FutureTask<Integer> count6 = count(500000, 600000);
        Thread thread6=new Thread(count6);
        FutureTask<Integer> count7 = count(600000, 700000);
        Thread thread7=new Thread(count7);
        FutureTask<Integer> count8 = count(700000, 800000);
        Thread thread8=new Thread(count8);
        FutureTask<Integer> count9 = count(800000, 900000);
        Thread thread9=new Thread(count9);
        FutureTask<Integer> count10 = count(900000, 1000000);
        Thread thread10=new Thread(count10);
        thread10.start();
        thread9.start();
        thread8.start();
        thread7.start();
        thread6.start();
        thread5.start();
        thread4.start();
        thread1.start();
        thread2.start();
        thread3.start();
        sum+=count1.get();
        sum+=count2.get();
        sum+=count3.get();
        sum+=count4.get();
        sum+=count5.get();
        sum+=count6.get();
        sum+=count7.get();
        sum+=count8.get();
        sum+=count9.get();
        sum+=count10.get();
        System.out.println(sum);
        System.out.println("利用多线程总耗时："+(System.currentTimeMillis()-start)+"(ms)");
    }

    public static FutureTask<Integer> count(int n,int m)
    {
        return new FutureTask<>(() -> {
            int sum=0;
            for (int i = n; i < m; i++) {
                boolean flag=true;
                for (int j = 2; j <=Math.sqrt(i); j++) {
                    if(i%j==0)
                    {
                        flag=false;
                        break;
                    }
                }
                if(flag)
                    sum+=1;
            }
            return sum;
        });
    }
}
