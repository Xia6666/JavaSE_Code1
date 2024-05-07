package test26;

import java.util.Arrays;

class Solution01 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        /*
        * [1]  1
        * [1,0]  1
        * [1,0,1]  2
        * [0,0,0]1 2
        *
        *
        * */
        int m1=0;
        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i]==1)
            {
                m1=i;
                break;
            }
        }
        int m=flowerbed.length-m1;
        int count = m % 2 == 0 ? m / 2 : (m + 1) / 2;
        long count1 = Arrays.stream(flowerbed).filter(s -> s == 1).count();
        int count2= m1 % 2 == 0 ? m1 / 2 : (m1 - 1) / 2;
        return count+count2>=n+count1;
     /*   int[] a = new int[flowerbed.length + 2];
        System.arraycopy(flowerbed, 0, a, 1, flowerbed.length);
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i - 1] == 0 && a[i] == 0 && a[i + 1] == 0) {
                a[i] = 1; // 种花！
                n--;
            }
        }
        return n <= 0;*/
    }

    public static void main(String[] args) {
        System.out.println(new Solution01().canPlaceFlowers(new int[]{0,0,1,0,0}, 1));
        System.out.println(0/2);
    }
}