package test18;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        int m=701;
        StringBuilder stringBuilder=new StringBuilder();
        while (m>0)
        {
            int n1=m%26;
            if(n1==0)
            {
                n1=26;
                m=m-26;
            }
            m=m/26;
            stringBuilder.append(n1);
            stringBuilder.append(",");
        }
        String s = stringBuilder.toString();
        System.out.println(s);
        String substring = s.substring(0, s.length() - 1);
        System.out.println(substring);
        String[] strings = substring.split(",");
        System.out.println(Arrays.toString(strings));
        StringBuilder stringBuilder1=new StringBuilder();
       for (int index = strings.length - 1; index >= 0; index--) {
          stringBuilder1.append((char) (Integer.parseInt(strings[index]) + 64));
        }

        System.out.println(stringBuilder1.toString());


    }
}
