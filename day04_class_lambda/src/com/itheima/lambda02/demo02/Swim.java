package com.itheima.lambda02.demo02;
@FunctionalInterface
public interface Swim {
    void swimming(int hour,String name);
}

interface Count{
    int max(int a,int b);
}