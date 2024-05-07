package com.itheima.compare02.test06;

public class Book implements Comparable<Book>{
    private String name;
    private Integer money;

    public Book() {
    }

    public Book(String name, Integer money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public int compareTo(Book o) {
        int result = this.money.compareTo(o.money);
        result= result==0?this.name.compareTo(o.name):result;
        return result;
    }
}
