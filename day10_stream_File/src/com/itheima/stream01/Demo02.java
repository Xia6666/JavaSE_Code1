package com.itheima.stream01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.stream.Stream;

public class Demo02 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        Collections.addAll(arrayList,"a王宝强","b贾乃亮","c陈羽凡","d张三","e张三丰","f张无忌","g迪丽热巴","h古力娜扎","i玛尔扎哈","j杨幂");

        //过滤可以用filter（）方法
         Stream<String> filterStream = arrayList.stream().filter(s -> s.length() >= 3);
       // filterStream.forEach(System.out::println);

        //截取前几个用limit（）方法
        Stream<String> limitStream = arrayList.stream().limit(6);
       // limitStream.forEach(System.out::println);

        //跳过前几个用skip（）方法
        Stream<String> skipStream = arrayList.stream().skip(5);
       // skipStream.forEach(System.out::println);

        //合并几个流的方法是
        Stream<String> concatStream = Stream.concat(limitStream, skipStream);
      //  concatStream.forEach(System.out::println);

        //筛选去除掉重复的元素。
        Stream<String> distinct = concatStream.distinct();
       // distinct.forEach(System.out::println);
        //注意事项：流只能被用一次，一旦被用过了就不能再使用了，否则就会抛异常IllegalStateException

        //Stream<String> sortedStream = distinct.sorted();
        //sortedStream.forEach(System.out::println);

        //sorted方法用于排序
        Stream<String> sortedStream = distinct.sorted((o1, o2) -> o2.compareTo(o1));


        //map方法用于转化数据类型，比如将String类型转化为Person类型
        Stream<Person> personStream = sortedStream.map(Person::new);
       // personStream.forEach(System.out::println);

        //count（）方法用于统计stream流中元素的个数
        long count = arrayList.stream().limit(6).sorted((o1, o2) -> o2.compareTo(o1)).count();
        //System.out.println(count);


        Stream.of("夏全恩","王亚楠").map(s->new Person(s)).forEach(System.out::println);

    }
}
class  Person{

    private String name;


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {

        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Person person = (Person) object;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
}