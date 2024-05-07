package com.itheima.bigdecimal.test;
import java.math.BigDecimal;
import java.util.Arrays;

/*已知数组如下:
int[] arr = {431,54,25,25,26,45,2,4,65,3,64,6,46,7,54};
1:使用Arrays对数组元素进行排序并打印排序后的结果；
2:使用二分法查找元素：2，并打印查询结果；
3:使用二分法查找200，并打印查找结果；
* */
public class Test05 {
    public static void main(String[] args) {
        int[] arr = {431, 54, 25, 25, 26, 45, 2, 4, 65, 3, 64, 6, 46, 7, 54};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 2));
        System.out.println(Arrays.binarySearch(arr, 200));

    }
}
