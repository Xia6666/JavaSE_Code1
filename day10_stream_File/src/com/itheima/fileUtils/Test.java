package com.itheima.fileUtils;

import org.apache.commons.io.FileUtils;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Scanner;

public class Test {
    private static String s;
    private static String s2;

    public static void main(String[] args) throws Exception {
/*

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你想要搜索的文件夹路径");
        String s1 = scanner.next();

        selectFile(getFile(s1));
*/


        File file1=new File("/Users/xiaquanen/IdeaProjects/JavaSE_Code_64/JavaSE_Code_64");
        deleteP(file1);

    }
    public static File getFile(String s)
    {
        return new File(s);
    }

    public static void selectFile(File file) throws Exception {
        File[] files = file.listFiles();
        {
            if (files != null) {
                for (File file1 : files) {
                    if (file1.isFile() && file1.getName().contains(".png")) {
                        FileUtils.copyFile(file1, new File("/Users/xiaquanen/IdeaProjects/JavaSE_Code_64/JavaSE_Code_64/day/"+ file1.getName()));
                    } else if (file1.isDirectory())
                        selectFile(file1);
                }
            }
        }
    }

    public static void deleteP(File file)
    {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isFile()&&file1.getName().contains(".png"))
                file1.delete();
        }
    }

}
