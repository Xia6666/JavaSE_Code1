package dao;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class HashMapUserDao {
    private static final HashMap<String,String> hashMap=new HashMap<>();
    static {
        System.out.println("数据载入中...");
       read();
    }
    public boolean judgeUserName(String name)  //判断是否含有该用户名
    {
       return hashMap.containsKey(name);
    }
    public boolean judgeUserPwd(String name,String pwd)  //判断密码是否对
    {
        return hashMap.get(name).equals(pwd);
    }

    public void registerUser(String name,String pwd)  //添加注册新用户
    {
        hashMap.put(name,pwd);
        write();
    }

    //从磁盘中读取数据
    public static void read()
    {
        //加载数据
        try (FileInputStream in=new FileInputStream("StudentSystemManagerV2.0/txt/user.txt");)
        {

            byte[] bytes=new byte[1024*1024*8];
            int len = in.read(bytes);
            String s=new String(bytes,0,len);
            String[] split = s.split(System.lineSeparator());
            for (String string : split) {
                String[] split1 = string.split(",");
                hashMap.put(split1[0],split1[1]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //向磁盘中写入数据

    public static void write()
    {
        try(FileOutputStream op=new FileOutputStream("StudentSystemManagerV2.0/txt/user.txt"))
        {
            hashMap.forEach((k,v)-> {
                try {
                    op.write((k+","+v).getBytes());
                    op.write(System.lineSeparator().getBytes(StandardCharsets.UTF_8));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
