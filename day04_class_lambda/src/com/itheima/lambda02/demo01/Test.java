package com.itheima.lambda02.demo01;

public class Test {
    public static void main(String[] args) {
        Swim swim1 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("铁子，我们去游泳吧！！");
            }

        };
        swim1.swimming();

//lambda表达式本质就是接口实现类对象的简化，前提得是接口中只有一个抽象方法！（函数式编程，所谓的函数式编程就是接口中只会对应一个结果，因为只有一个抽象方法）
        Swim swim2 = () -> System.out.println("铁子，我们去游泳吧！！");
        swim2.swimming();
}


}
