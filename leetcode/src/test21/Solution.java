package test21;

class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder stringBuilder=new StringBuilder();
        int tmp=0;
        int i=num1.length()-1;
        int j=num2.length()-1;
        while (i>=0||j>=0) {
           int n1=i<0?0:num1.charAt(i)-'0';
           int m1=j<0?0:num2.charAt(j)-'0';
            int sum = n1 + m1+tmp;
            int count=sum%10;
            tmp=sum/10;

            stringBuilder.append(count);
            i--;
            j--;
        }
        if(tmp==1)
       {
           stringBuilder.append(1);
       }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        /*System.out.println(new Solution().addStrings("11", "123"));*/
        char[] chars={'a','s','d','f'};
        String string=new String(chars);
        StringBuilder stringBuilder=new StringBuilder(string);
        System.out.println(stringBuilder.reverse());
    }
}