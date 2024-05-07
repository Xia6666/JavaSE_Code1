package test03;

import java.math.BigDecimal;

public class User {
    private String name;
    private int money1;
    private int money2;

    public User() {
    }

    public User(String name, int money1, int money2) {
        this.name = name;
        this.money1 = money1;
        this.money2 = money2;
    }
    public void start(Double money){
        money2-=money;
        money1+=money;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", money1=" + money1 +
                ", money2=" + money2 +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney1() {
        return money1;
    }

    public void setMoney1(int money1) {
        this.money1 = money1;
    }

    public double getMoney2() {
        return money2;
    }

    public void setMoney2(int money2) {
        this.money2 = money2;
    }
}
