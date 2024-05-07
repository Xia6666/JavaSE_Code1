package test01;

public class FruitUtil {
    private FruitUtil(){};

    public static Double getMoney(Double n,Fruit fruit)
    {
        return fruit.getMoney()*n;
    }
}
