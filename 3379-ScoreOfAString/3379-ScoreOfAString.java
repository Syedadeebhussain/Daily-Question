// Last updated: 31/7/2025, 2:21:53 pm
class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        int diff=0;
        int d1=0,d2=0;
        for(int i=0;i<s.length()-1;i++)
        {
            char ch1=s.charAt(i);
            d1=(int)ch1;
            char ch2=s.charAt(i+1);
            d2=(int)ch2;
           diff=Math.abs(d1-d2);
           sum+=diff;
        }
        return sum;
    }
}