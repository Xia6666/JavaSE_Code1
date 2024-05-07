package com.itheima;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test08 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor=new ThreadPoolExecutor(2,3,30, TimeUnit.SECONDS,new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        Phone phone = new Phone();
        executor.execute(() -> {
            try {
                phone.re();
            } catch (Exception e) {

            }
        });


        executor.execute(() -> {
            try {
                phone.send();
            } catch (Exception e) {

            }
        });

    }



    private static class Phone{

        public synchronized void send() throws Exception {
            DatagramSocket socket=new DatagramSocket(2022);
            Scanner scanner = new Scanner(System.in);
            while (true)
            {
                System.out.println("请输入一段英文进行发送：");
                String msg = scanner.nextLine();
                if(Objects.equals(msg,"exit"))
                {
                    System.out.println("发送端关闭");
                    socket.close();
                    return;
                }
                byte[] bytes = msg.getBytes();
                DatagramPacket packet=new DatagramPacket(bytes,bytes.length, InetAddress.getByName("127.0.0.1"),2020);
                socket.send(packet);

                Thread.sleep(1000);

                byte[] bytes1 = new byte[1024 * 8];
                DatagramPacket datagramPacket = new DatagramPacket(bytes1, bytes.length);
                socket.receive(datagramPacket);
                System.out.println(new String(datagramPacket.getData(),0,datagramPacket.getLength()));

            }

        }

        public  void re() throws Exception
        {
            DatagramSocket socket=new DatagramSocket(2020);
            byte[] bytes=new byte[1024*8];
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
            while (true)
            {
                socket.receive(datagramPacket);
                String s = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
                System.out.println("服务器端收到消息："+s);
                String upperCase = s.toUpperCase();
                DatagramPacket datagramPacket1 = new DatagramPacket(upperCase.getBytes(), upperCase.length(), InetAddress.getByName("127.0.0.1"), 2022);
                socket.send(datagramPacket1);
                System.out.println("服务器端已经将消息发送给客户了！！");
                socket.close();

            }
            
        }









    }
}
