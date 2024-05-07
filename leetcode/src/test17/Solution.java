package test17;

class Solution {
    public int titleToNumber(String columnTitle) {
        int sum=0;
        for (int index = columnTitle.length()-1; index >=0; index--) {
            sum+=(columnTitle.charAt(index) - 64)*(int)(Math.pow(26,((columnTitle.length()-1)-index)));

        }
      return sum;
    }

    public static void main(String[] args) {

        System.out.println(new Solution().titleToNumber("ZY"));
    }
}