package com.itheima.stream01.test01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*有两个集合，一个有6个男演员，一个有6个女演员，完成下面的功能
1.男演员只要名字为3个字的前三人
2.女演员只要姓林的，并且不要第一个
3.把过滤后的男演员姓名和女演员姓名合并到一起
4.上一步操作后的元素作为构造方法的参数创建演员对象（实例化一个Actor类,类中只有一个属性,演员姓名，此处尝试使用map）,并调用收集方法转换成List<Actor>.
*/
public class Test04 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1=new ArrayList<>();
        ArrayList<String> arrayList2=new ArrayList<>();
        Collections.addAll(arrayList1,"李易峰","刘昊然","周杰伦","王力宏","张杰","薛之谦","王俊凯");
        Collections.addAll(arrayList2,"柳岩","杨幂","刘浩存","刘亦菲","林心如","林林林","林亦非");

        Stream<String> men = arrayList1.stream().filter(s -> s.length() == 3).limit(3);
        Stream<String> women = arrayList2.stream().filter(s -> s.startsWith("林")).skip(1);
        Stream<String> total = Stream.concat(men, women);
        List<Actor> actorList = total.map(Actor::new).collect(Collectors.toList());

        for (Actor actor : actorList) {
            System.out.println(actor);
        }

    }
}
class Actor{
    private String name;

    public Actor() {
    }

    public Actor(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Actor actor = (Actor) object;
        return Objects.equals(name, actor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
