package com.itheima.generic01;

//定义泛型的时候类型不确定，等真正创建使用的时候再去确定

//泛型的符号不一定是E，也可以自定义，常用字符E，T，K，V

public class MyList <E>{
    private Object[] objects=new Object[999999];

    public void add(E e)
    {
        objects[0]=e;
    }

    public E get()
    {
        return (E)(objects[0]);
    }

    public static void main(String[] args) {
        MyList<Integer> list=new MyList<>();
        list.add(2);
        System.out.println(list.get());
    }
}
