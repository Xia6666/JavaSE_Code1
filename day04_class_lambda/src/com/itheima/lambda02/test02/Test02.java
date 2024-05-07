package com.itheima.lambda02.test02;
/*
    定义一个函数式接口Animal，Animal中有抽象方法eat方法。
    定义一个测试类，在测试类中定义方法useAnimal方法，形参Animal类型
    在不定义新的类文件的前提下，调用useAnimal方法。
        提示：使用2种方式使用useAnimal方法（1、匿名内部类 2、Lambda表达式）
 */
public class Test02 {
    public static void main(String[] args) {
        //多态！！！
        useAnimal(()-> System.out.println("猫吃鱼！（lambda）"));

        useAnimal(new Animal() {
            @Override
            public void eat() {
                System.out.println("狗吃骨头！（匿名内部类）");
            }
        });
    }
    public static void useAnimal(Animal animal)
    {
        animal.eat();
    }

}
