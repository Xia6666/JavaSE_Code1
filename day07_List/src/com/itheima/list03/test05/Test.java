package com.itheima.list03.test05;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();
        ArrayList<String> arrayList=new ArrayList<>();
        Random random=new Random();

        name.add("郭靖");
        name.add("黄蓉");
        name.add("黄药师");
        name.add("老顽童");
        name.add("瑛姑");



        arrayList.add("吃芥末");
        arrayList.add("学羊叫5声");
        arrayList.add("做10个俯卧撑");
        arrayList.add("喝一杯啤酒");
        arrayList.add("蛙跳10个");

        for (int i = 0; i < name.size(); i++) {
           int index= random.nextInt(arrayList.size());
            String s=arrayList.remove(index);
            System.out.println(name.get(i)+"抓到的阄："+s);

        }

    }
}
