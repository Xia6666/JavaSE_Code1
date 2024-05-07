package test03;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        HashMap<String,Double> hashMap=new HashMap<>();
        User user = new User("张三", 0, random.nextInt(10000)+1);
        int j=0;
        while (user.getMoney2()>0)
        {
            System.out.println("*****************************************");
            System.out.println("*****************************************");
            System.out.println("已砍："+user.getMoney1()/100+"元,还差："+user.getMoney2()/100+"元");
            System.out.println("----------------->砍价帮<-----------------");
            System.out.println("是否砍价，(输入砍价用户名)：");
            String name = scanner.next();
            if(!hashMap.containsKey(name))
            {
                double v=  random.nextInt(10000)+1;
                while (v == 0 || !(v <= user.getMoney2())) {
                    v = random.nextInt(10000) + 1;
                }
                hashMap.put(name,v);
                System.out.println("砍价成功！"+name+"为"+user.getName()+"砍掉"+v /100+"元");
                user.start(v);
            }
            else {
                System.out.println("已经砍过的用户不能重新砍价。。。");
            }
        }
        System.out.println("砍价结束");
        hashMap.forEach((k,v)-> System.out.println(k+"砍了"+v /100+"元"));
    }
}
