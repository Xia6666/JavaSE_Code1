package com.itheima.stream01.test01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Test01 {
    public static void main(String[] args) {
                ArrayList<String> list = new ArrayList<>();
                Collections.addAll(list, "乔杉","林青霞", "张曼玉", "王祖贤", "柳岩", "张敏", "张无忌", "张三丰", "张翠山");

                //1. 将list中前6个人截取到一个Stream流中
                Stream<String> limit = list.stream().limit(6);


                //2. 将list中后面3个截取到一个Stream流中
                 Stream<String> skip = list.stream().skip(list.size()-3);
                //3. 将limitStream和skipStream进行合并
                Stream<String> concat = Stream.concat(limit, skip);

                  //4. 将合并后的流中的重复数据清除掉
                 Stream<String> distinct = concat.distinct();


                 //5. 将当前流中以张开头的数据筛选出并打印
                distinct.filter(s->s.startsWith("张")).forEach(System.out::println);
            }
        }

