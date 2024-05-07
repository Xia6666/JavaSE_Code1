package com.itheima.fileOutputStream01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Demo02 {
    public static void main(String[] args) throws Exception {
        FileOutputStream outputStream=new FileOutputStream("day11_IO01/xia.txt");
        write("\t静夜思",outputStream);
        write("\t床前明月光",outputStream);
        write("\t疑是地上霜",outputStream);
        write("\t举头望明月",outputStream);
        write("\t低头思故乡",outputStream);

        //获取操作系统的换行符号
        String string = System.lineSeparator();
        outputStream.write(string.getBytes(StandardCharsets.UTF_8));

        //可以写一个字节
       // outputStream.write(97);

        //也可以写一个字节数组
       // outputStream.write(new byte[]{98,99,100});

        //也可以将字符串转化为字节数组
      /*  outputStream.write("疑是地上霜".getBytes(StandardCharsets.UTF_8));
        outputStream.write(string.getBytes(StandardCharsets.UTF_8));
        outputStream.write("举头望明月".getBytes(StandardCharsets.UTF_8));
        outputStream.write(string.getBytes(StandardCharsets.UTF_8));
        outputStream.write("低头思故乡".getBytes(StandardCharsets.UTF_8));
        outputStream.write(string.getBytes(StandardCharsets.UTF_8));
*/

        outputStream.close();
    }
    public static void write(String s, FileOutputStream file) throws IOException {
        file.write(s.getBytes(StandardCharsets.UTF_8));
        file.write(System.lineSeparator().getBytes(StandardCharsets.UTF_8));
    }
}
