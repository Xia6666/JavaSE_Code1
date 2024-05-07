package test12;

class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        for (int i = 0; i < prices.length-1; i++) {
            int k=prices[i];
            for (int j = i+1; j <prices.length ; j++) {
                if(prices[j]-k>max)
                    max=prices[j]-k;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().maxProfit(new int[]{7,6,4,3,1}));
    }

}