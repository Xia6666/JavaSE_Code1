package com.itheima.extends01.test04;

public class Test {
    public static void main(String[] args) {
        Coder coder = new Coder("张三", "071220309", 10000);
        coder.work();
        Manager manager = new Manager("李四", "071220308", 15000,5000);
        manager.work();
    }
}
