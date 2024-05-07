package com.xiaqe.dao;

import com.xiaqe.pojo.User;

import java.io.*;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;

public class UserDao implements UserBaseDao {
   public static HashSet<User> users=new HashSet<>();
    static {
        System.out.println("数据初始化中。。。。。");
        read();
        System.out.println("初始化完毕。。。。。");
        //users.forEach(System.out::println);
    }


    @Override
    public boolean isExistName(String name) {
        for (User user : users) {
           if(user.getUseName().equals(name))
               return true;
        }
        return false;
    }

    @Override
    public boolean judgment(User user) {
      return users.contains(user);
    }

    @Override
    public void addUser(User user) {
       users.add(user);
       write();
    }

    @Override
    public boolean changePws(String name, String pws) {
        for (User user : users) {
            if(user.getUseName().equals(name)&&user.getPws().equals(pws))
            {
                return false;
            }
            else if(user.getUseName().equals(name))
            {
                user.setPws(pws);
                users.add(new User(name,pws));
                write();
                return true;
            }
        }
        return false;
    }


    public static void read()
    {
        try(FileInputStream in=new FileInputStream("StudentSystemManagerV2.1/resource/user.txt");)
        {
            byte[] bytes=new byte[1024*1024*8];
            int len = in.read(bytes);
            String s=new String(bytes,0,len);
            String[] split = s.split(System.lineSeparator());
            for (String string : split) {
                users.add(new User(string.split(",")[0],string.split(",")[1]));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void read1() {
        try(BufferedInputStream in=new BufferedInputStream(new FileInputStream("StudentSystemManagerV2.1/resource/user.txt")))
        {
            byte[] bytes=new byte[1024*1024*8];
            int len = in.read(bytes);
            String s=new String(bytes,0,len);
            String[] split = s.split(System.lineSeparator());
            for (String string : split) {
                users.add(new User(string.split(",")[0],string.split(",")[1]));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void read2() {
        try(FileReader in=new FileReader("StudentSystemManagerV2.1/resource/user.txt"))
        {
            int ch;
            StringBuilder stringBuilder = null;
            while ((ch=in.read())!=-1)
            {
                stringBuilder.append((char) ch);
            }
            String s = stringBuilder.toString();
            String[] split = s.split(System.lineSeparator());
            for (String string : split) {
                users.add(new User(string.split(",")[0],string.split(",")[1]));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void read3() {
        try(BufferedReader in=new BufferedReader(new FileReader("StudentSystemManagerV2.1/resource/user.txt")))
        {
            String  str;
            ArrayList<String> arrayList=new ArrayList<>();
            while ((str=in.readLine())!=null)
            {
                arrayList.add(str);
            }
            for (String s : arrayList) {
                users.add(new User(s.split(",")[0], s.split(",")[1]));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void write()
    {
        try(FileOutputStream op=new FileOutputStream("StudentSystemManagerV2.1/resource/user.txt");)
        {
            for (User user : users)
            {
                op.write(user.toString().getBytes(StandardCharsets.UTF_8));
                op.write(System.lineSeparator().getBytes(StandardCharsets.UTF_8));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void write1()
    {
        try(BufferedOutputStream op=new BufferedOutputStream(new FileOutputStream("StudentSystemManagerV2.1/resource/user.txt"));)
        {
            for (User user : users)
            {
                op.write(user.toString().getBytes(StandardCharsets.UTF_8));
                op.write(System.lineSeparator().getBytes(StandardCharsets.UTF_8));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void write2()
    {
        try(FileWriter op=new FileWriter("StudentSystemManagerV2.1/resource/user.txt"))
        {
            for (User user : users)
            {
                op.write(user.toString());
                op.write(System.lineSeparator());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void write3()
    {
        try(BufferedWriter op=new BufferedWriter(new FileWriter("StudentSystemManagerV2.1/resource/user.txt")))
        {

            for (User user : users)
            {
                op.write(user.toString());
                op.newLine();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
