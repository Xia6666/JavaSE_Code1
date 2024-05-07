package test01;

import java.util.Objects;

public class Fruit {
    private String name;
    private String adr;
    private Double money;

    public Fruit() {
    }

    public Fruit(String name, String adr, Double money) {
        this.name = name;
        this.adr = adr;
        this.money = money;
    }

    public void k()
    {
        System.out.println(name+"开花了");
    }public void j()
    {
        System.out.println(name+"被摘了");
    }public void c()
    {
        System.out.println(name+"结果了");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Fruit fruit = (Fruit) object;
        return Objects.equals(name, fruit.name) && Objects.equals(adr, fruit.adr) && Objects.equals(money, fruit.money);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, adr, money);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", adr='" + adr + '\'' +
                ", money=" + money +
                '}';
    }
}
