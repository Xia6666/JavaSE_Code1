package com.itheima.list03.test07;

import java.util.ArrayList;
import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        Random random=new Random();
        double sum1=0;
        int max=0;
        while (arrayList.size()<=80)
        {
            int i=random.nextInt(71)+30;
            sum1+=i;
            arrayList.add(i);
            if(max<i)
                max=i;
        }
        System.out.println("所有学生的成绩是："+arrayList);

        int sum=0;
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i)<60)
                sum++;
        }
        System.out.println("不及格学生的个数："+sum);

        System.out.println("学生平均分是："+sum1/arrayList.size());

        System.out.println("学生中的最高分："+max);
    }
}
