package test04;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) throws UnknownHostException {
        Scanner scanner=new Scanner(System.in);
        TreeSet<News> treeSet=new TreeSet<>((o1, o2) -> o2.getCount() - o1.getCount());
        Collections.addAll(treeSet,new News("第1次世界大战",111),
                new News("第2次世界大战",222),
                new News("第3次世界大战",333),
                new News("第4次世界大战",444),
                new News("第5次世界大战",555),
                new News("第6次世界大战",666),
                new News("第7次世界大战",777),
                new News("第8次世界大战",888),
                new News("第9次世界大战",999),
                new News("第10次世界大战",1000),
                new News("第11次世界大战",123),
                new News("第12次世界大战",43),
                new News("第13次世界大战",434),
                new News("第14次世界大战",1231),
                new News("第15次世界大战",9999)
               );
        while (true) {
            System.out.println("==========================百度热搜==========================");
            int j=0;
            for (News news : treeSet) {
                if(j>=10) break;
                System.out.println(news);
                j++;
            }
            System.out.println("请选择需要查看的新闻：");
            String news = scanner.next();
            System.out.println("请输入需要的操作：1.点赞 2.评论 3.收藏");
            int i = scanner.nextInt();
            if(i==1) i=3;
            else if(i==2) i=5;
            else if(i==3) i=8;
            for (News news1 : treeSet) {
                if(news1.getTitle().equals(news))
                {
                    int count = news1.getCount();
                    count+=i;
                    news1.setCount(count); ;
                    break;
                }
            }
        }
    }
}
