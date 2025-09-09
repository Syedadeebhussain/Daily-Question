// Last updated: 9/9/2025, 11:44:00 am
class Solution {
    public int alternateDigitSum(int n) {
        String s=String.valueOf(n);
        int sum=0;
        for(int i=0;i<s.length();i++){
            int r=s.charAt(i)-'0';
            if(i%2==0) sum+=r;
            else  sum+=(-r);
        }
        return sum;
    }
}