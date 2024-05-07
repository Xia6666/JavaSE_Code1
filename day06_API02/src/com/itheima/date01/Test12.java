package com.itheima.date01;

import java.time.LocalDateTime;

public class Test12 {
    public static void main(String[] args) {
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime localDateTime1=LocalDateTime.of(2002,2,10,1,20);

        System.out.println(localDateTime1);
    }
}
