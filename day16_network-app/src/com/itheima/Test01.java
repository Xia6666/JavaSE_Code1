package com.itheima;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test01 {
    public static void main(String[] args) {

        ThreadPoolExecutor executor=new ThreadPoolExecutor(2,3,30, TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(10),new ThreadPoolExecutor.AbortPolicy());
        executor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    new Test01().re();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
        executor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    new Test01().sent();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });


    }

    public void sent() throws Exception {
        DatagramSocket datagramSocket=new DatagramSocket(8080);
        Scanner scanner=new Scanner(System.in);

        while (true)
        {
            System.out.println("请输入你想要发送的内容：");
            String s = scanner.nextLine();
            if(Objects.equals(s,"exit"))
            {
                return;
            }
            byte[] bytes = s.getBytes();
            DatagramPacket datagramPacket=new DatagramPacket(bytes,bytes.length, InetAddress.getLocalHost(),8088);
            datagramSocket.send(datagramPacket);
            Thread.sleep(100);
        }


    }


    public void re() throws Exception {
        DatagramSocket datagramSocket=new DatagramSocket(8088);
        byte[] bytes=new byte[1024];

        DatagramPacket datagramPacket=new DatagramPacket(bytes,bytes.length);

        while (true)
        {
            datagramSocket.receive(datagramPacket);
            int length = datagramPacket.getLength();
            System.out.println(new String(datagramPacket.getData(),0,length));


        }


    }

}
