package test01;

public class Demo {
    public static void main(String[] args) {
        Fruit apple = new Fruit("红富士苹果", "山东烟台", 20.0);
        Double money = FruitUtil.getMoney(3.0, apple);
        System.out.println(money);
    }
}
