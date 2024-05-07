package test26;

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
      int light=0;
      int right=1;
      int m=0;
      while (right<flowerbed.length)
      {
          if(flowerbed[light]==flowerbed[right])
          {
              m++;
              light+=2;
              right+=2;
          }
          else {
              light++;
              right++;
          }
      }
      return m==n;

    }

    public static void main(String[] args) {
        System.out.println(new Solution().canPlaceFlowers(new int[]{1,0,0,0,0,1}, 2));
    }
}