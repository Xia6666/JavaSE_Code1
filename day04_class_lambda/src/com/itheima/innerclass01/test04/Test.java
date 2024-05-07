package com.itheima.innerclass01.test04;

public class Test {
    public static void main(String[] args) {
       Computer.start();
       Computer.stop();

        Computer mouse=new Mouse();
        mouse.connet();
        mouse.disconnet();

        Computer keyboard=new Keyboard();
        keyboard.connet();
        keyboard.disconnet();
    }
}
