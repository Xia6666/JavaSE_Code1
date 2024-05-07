package com.itheima;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test03 {
    public static void main(String[] args) {
        UDP udp = new UDP();
        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(3,6,30, TimeUnit.SECONDS,new ArrayBlockingQueue<>(10),new ThreadPoolExecutor.AbortPolicy());
        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    udp.send();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    udp.re();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

        System.out.println("hello world!");


    }

    private static class UDP{
        public void send() throws Exception
        {
            DatagramSocket datagramSocket=new DatagramSocket(66);
            Scanner scanner=new Scanner(System.in);
            while (true)
            {
               // System.out.println("请输入你要发送的内容：");
                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
                SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("HH时mm分ss秒");
                Date date = simpleDateFormat.parse("2024年4月29日 22时00分00秒");
                Date date1 = new Date();
                long l = date.getTime() - date1.getTime();
                String format = simpleDateFormat1.format(l);

                //  String next = scanner.next();
                byte[] bytes=format.getBytes(StandardCharsets.UTF_8);
                DatagramPacket datagramPacket=new DatagramPacket(bytes,bytes.length, InetAddress.getByName("255.255.255.255"),8888);
                datagramSocket.send(datagramPacket);
                Thread.sleep(1000);
            }

        }
        public void re() throws Exception {
            DatagramSocket datagramSocket = new DatagramSocket(8888);
            byte[] bytes = new byte[1024 * 8];
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
            while (true) {
            datagramSocket.receive(datagramPacket);
            System.out.println(datagramPacket.getAddress().getHostName()+"-"+datagramPacket.getAddress()+":\t"+new String(datagramPacket.getData(), 0, datagramPacket.getLength()));
                System.out.println();
        }

        }
    }
}
