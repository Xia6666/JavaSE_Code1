package com.itheima;

import java.io.*;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Test10 {
    public static void main(String[] args) {
        Movie movie = new Movie();
        ThreadPoolExecutor executor=new ThreadPoolExecutor(5,10,30, TimeUnit.SECONDS,new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        executor.execute(new Runnable() {
            @Override
            public void run() {
                movie.buy();
            }
        });      executor.execute(new Runnable() {
            @Override
            public void run() {
                movie.buy();
            }
        });      executor.execute(new Runnable() {
            @Override
            public void run() {
                movie.buy();
            }
        });      executor.execute(new Runnable() {
            @Override
            public void run() {
                movie.buy();
            }
        });      executor.execute(new Runnable() {
            @Override
            public void run() {
                movie.buy();
            }
        });
    }

    private static class Movie{
        private final static HashMap<String,Integer> hashMap=new HashMap<>();
        private static final Properties properties=new Properties();

      static {
          try {
              properties.load(new FileReader("day16_network-app/resource/movies.properties"));
              Set<String> set = properties.stringPropertyNames();
              for (String s : set) {
                  hashMap.put(s, Integer.valueOf(properties.getProperty(s)));
              }
          } catch (IOException ex) {
              throw new RuntimeException(ex);
          }
      }
      public synchronized void buy()
      {
          HashMap<String,Integer> user=new HashMap<>();
          Scanner scanner=new Scanner(System.in);
          System.out.println("===========欢迎进入电影购票系统===========");
          System.out.println("1,查看电影票信息和余额");
          System.out.println("2,查看已经购买的电影票信息");
          System.out.println("3,选择购买电影票");
          System.out.println("4,退出系统");
          while (true) {
              System.out.println("请选择：");
              int n = scanner.nextInt();
              switch (n) {
                  case 1:
                        hashMap.forEach((k,v)-> System.out.println(k+":"+v+"张"));
                      break;
                  case 2:
                      if (user.isEmpty()) {
                          System.out.println("你还没有购买呢！");
                          break;
                      }
                      user.forEach((k, v) -> System.out.println(k + ": " + v + "张"));
                      break;
                  case 3:
                      System.out.println("请输入你要购买的电影票名称：");
                      String name = scanner.next();
                      if(hashMap.containsKey(name)&&hashMap.get(name)!=0)
                      {
                          if(user.containsKey(name))
                          {
                              Integer i1 = user.get(name);
                              user.put(name,++i1);
                          }
                          else {
                              user.put(name,1);
                          }
                          System.out.println(name+"购买成功！");
                          Integer i11 = hashMap.get(name);
                          hashMap.put(name,--i11);
                      }
                      else
                          System.out.println("电影不存在或者没有票了！");
                      break;
                  case 4:
                      System.out.println("欢迎下次光临！");
                      hashMap.forEach((k,v)->properties.setProperty(k, String.valueOf(v)));
                      try {
                          properties.store(new FileOutputStream("day16_network-app/resource/movies.properties"),"");
                      } catch (IOException e) {
                          throw new RuntimeException(e);
                      }
                      return;
              }
          }
      }
    }
}
