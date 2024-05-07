package com.itheima.extends01.demo06;
//1，通过Override来检验方法重写是否规范
//2，子类方法的重写，方法名得一样，参数列表也得一样，返回值只有是父类方法返回值的子类型是才可以不一样，否则都得一样。
//3,子类方法的重写的修饰权限不能低于父类被重写的方法
//4,父类的私有方法不能被继承，更不能被重写
//5,静态方法不能被重写，被final修饰的方法也不能被重写


public class Father {
    public void method01()
    {

    }
    public Father method02()
    {
        return new Father();
    }

     void method03()
    {

    }

    private  void method04()
    {

    }

    public static void method05()
    {

    }
}


class Son extends Father {
    @Override   //1，通过Override来检验方法重写是否规范
    public void method01()
    {
    }

    @Override
    public Son method02() {
        return new Son();
    }//2，子类方法的重写，方法名得一样，参数列表也得一样，返回值只有是父类方法返回值的子类型是才可以不一样，否则都得一样。

    @Override
    protected void method03() {
        //3,子类方法的重写的修饰权限不能低于父类被重写的方法
    }
    protected void method03(float a) {
        //3,子类方法的重写的修饰权限不能低于父类被重写的方法
    }

   /*@Override
    public void method04() {
       //4,父类的私有方法不能被继承，更不能被重写
    }*/

    public static void method05()
    {
        //5,静态方法不能被重写，被final修饰的方法也不能被重写
    }

}