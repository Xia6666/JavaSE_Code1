package com.itheima.extends01.test04;

public class Coder {
    private String name;
    private String id;
    private double money;

    public Coder() {
    }

    public Coder(String name, String id, double money) {
        this.name = name;
        this.id = id;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    public void work()
    {
        System.out.println("姓名为："+name+"，工号为："+id+"，工资为："+money+"的程序员正在写代码");
    }
    }


