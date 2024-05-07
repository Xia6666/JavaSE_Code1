package com.itheima.extends01.test02;

public class Phone6 {
    public void call()
    {
        System.out.println("打电话");
    }
    public void send()
    {
        System.out.println("发短信");
    }

}
class Phone15 extends Phone6 {
    public void call()
    {
        super.call();
        System.out.println("开启视频聊天");
    }
    public void send()
    {
        super.send();
        System.out.println("语音聊天");
    }

}