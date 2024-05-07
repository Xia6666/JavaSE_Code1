package com.itheima;

import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test07 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor=new ThreadPoolExecutor(2,3,30, TimeUnit.SECONDS,new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        CopyFile copyFile = new CopyFile();
        copyFile.select(new File("day16_network-app/resource"));
        executor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    copyFile.readFile();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
        executor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    copyFile.writeFile();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

    }
    private static class CopyFile{
        char[] chars=new char[1024*8];
        int len;
       File file2=new File("day16_network-app/result");

       public static ArrayList<String> filePath=new ArrayList<>();

       public static ArrayList<String> fileName=new ArrayList<>();

        public void readFile() throws Exception {
            for (String s : filePath) {
                synchronized (this) {
                    FileReader fileReader = new FileReader(s);
                    len = fileReader.read(chars);
                    fileReader.close();
                    this.notify();
                    this.wait();
                }
            }

        }
        public void writeFile() throws Exception {
            for (String s : fileName) {
                synchronized (this) {
                    FileWriter fileWriter = new FileWriter(file2+"/"+s);
                    fileWriter.write(chars, 0, len);
                    fileWriter.close();
                    this.notify();
                    this.wait();
                }
            }
        }
        public void select(File file)
        {
            File[] files = file.listFiles();

            if (files != null) {
                for (File file1 : files) {
                    if(file1.isFile()&&file1.getName().contains(".txt"))
                    {
                        filePath.add(file1.getPath());
                        fileName.add(file1.getName());

                    }
                    else if(file1.isDirectory())
                    {
                        select(file1);
                    }
                }
            }
        }



    }
}
