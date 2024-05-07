package com.itheima.bigdecimal.test;
/*
在某次比赛中，共有8位评委，采用百分制。
去除一个最低分和一个最高分，其余的平均得分即为选手的最终得分。
请编写程序，使用所学集合知识，计算选手的得分，评分分数由键盘录入。要求对得分进行精确运算
运行效果如下：
    请录入第1个评委成绩：
    100
    请录入第2个评委成绩：
    95
    请录入第3个评委成绩：
    95
    请录入第4个评委成绩：
    90
    请录入第5个评委成绩：
    90
    请录入第6个评委成绩：
    80

    选手最终得分为：90.83
 */


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double[] score=new double[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("请录入第"+(i+1)+"个评委成绩：");
            score[i]=scanner.nextDouble();
        }
       Arrays.sort(score);
        BigDecimal sum=new BigDecimal(score[1]+"");
        for (int i = 2; i <5 ; i++) {
           sum= new BigDecimal(score[i]+"").add(sum);
        }
        System.out.println(sum.divide(new BigDecimal("4"),2));
    }
}
