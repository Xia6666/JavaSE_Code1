package com.itheima.innerclass01.test05;

public class Man extends Person{

    public Man() {
    }

    public Man(String name, double height) {
        super(name, height);
    }

    public void behavior(Woman woman)
    {
        System.out.print(this.getName()+"得挣钱！");
        System.out.println("还得和"+woman.getName()+"一起逛街！");
    }

}


