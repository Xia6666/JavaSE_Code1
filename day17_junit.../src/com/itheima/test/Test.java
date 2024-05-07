package com.itheima.test;

public class Test {
    public static void main(String[] args) {
        Service service=new ServiceImpl();
        Service service1 = ProxyFactory.getService(service);
        service1.execute();
    }
}
