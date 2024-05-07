package com.itheima;
public class Test01 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int sum=4;
        for (int i = 9; i <1000000; i++) {
            boolean flag=true;
            for (int j = 2; j <i; j++) {
                if(i%j==0)
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
                sum+=1;
        }
        System.out.println(sum);
        System.out.println("单线程总耗时："+(System.currentTimeMillis()-start)+"(ms)");
    }
}
