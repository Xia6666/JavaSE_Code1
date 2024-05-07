package test28;

class Solution {
    public int minTimeToType(String word) {
        int count=0;

        for (int i = 0,j=i+1; j < word.length(); i++,j++) {
            char chI=word.charAt(i);
            char chJ=word.charAt(j);
            count+= Math.min(26-Math.abs(chJ - chI),Math.abs(chJ - chI));
            count++;
        }
        char chI=word.charAt(0);
        count+= Math.min(26-Math.abs('a' - chI),Math.abs('a' - chI));
        count++;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().minTimeToType("abc"));
    }
}