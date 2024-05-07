package com.itheima.innerclass01.test04;

public interface Computer {

    static void start()
    {
        System.out.println("电脑开机了");
    }
    static void stop()
    {
        System.out.println("电脑关机了");
    }
    void connet();
    void disconnet();
}

class Mouse implements Computer {
    @Override
    public void connet() {
        System.out.println("鼠标连接了!");
    }

    @Override
    public void disconnet() {
        System.out.println("鼠标断开了！");
    }
}

class Keyboard implements Computer{
    @Override
    public void connet() {
        System.out.println("键盘连接了！");
    }

    @Override
    public void disconnet() {
        System.out.println("键盘断开了！");
    }
}