package maopao;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        sort1(new int[]{3,1,7,5,9,3});
        System.out.println("++++++++++++++++++++++++++");
        sort2(new int[]{3,1,7,5,9,3});
    }

    //冒泡排序
    public static int [] sort1(int[] a)
    {

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]>a[j])
                {
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
                System.out.println(Arrays.toString(a));
            }

        }
        return a;
    }

    //选择排序
    public static int[] sort2(int[] a)
    {

        for (int i = 0; i < a.length; i++) {
            int min=i;
            for (int j = i+1; j < a.length; j++) {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }
            int t=a[min];
            a[min]=a[i];
            a[i]=t;
            System.out.println(Arrays.toString(a));

        }
        return a;

    }


}
