package com.itheima.innerclass01.method01;

public class Computer {
    private class Cpu{
        private String name;
        private String xh;
        public void method()
        {
            System.out.println("cpu在计算！");
        }
    }
    private String motherboard;

    public void compute(){
        Cpu cpu = new Cpu();
        cpu.method();
    }

    public void office(){

    }

}

