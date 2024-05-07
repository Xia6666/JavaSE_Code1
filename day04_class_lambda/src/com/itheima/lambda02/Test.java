package com.itheima.lambda02;

public class Test {

        public void show(){
            int a=10;
            class Inside{
                public void show(){
                    System.out.println("a = " + a);//10
                }
            }
            Inside in = new Inside();

          in.show();
        }
    }

