package com.itheima.api01.demo01;

public class SystemDemo02 {
    public static void main(String[] args) {

        long bg=System.nanoTime();
        method();
        long now=System.nanoTime();
        System.out.println(now-bg);

        System.currentTimeMillis();
    }

    public static void method()
    {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello world!");

        }
    }
}
