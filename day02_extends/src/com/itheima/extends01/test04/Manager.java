package com.itheima.extends01.test04;

public class Manager extends Coder {
    private double money666;

    public Manager() {

    }

    public Manager(String name, String id, double money, double money666) {
        super(name, id, money);
        this.money666 = money666;
    }

    @Override
    public void work()
    {
        System.out.println("姓名为："+getName()+"，工号为："+getId()+"，工资为："+getMoney()+"，奖金为："+money666+"的项目经理正在管理程序员写代码");
    }

}
