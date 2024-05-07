package test03;

public class User1 {
    private String name;
    private double money;

    public User1() {
    }

    public User1(String name, double money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public String toString() {
        return "User1{" +
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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
