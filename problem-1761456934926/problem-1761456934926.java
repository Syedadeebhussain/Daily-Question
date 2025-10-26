// Last updated: 26/10/2025, 11:05:34 am
class Solution {
    public long removeZeros(long n) {
       String s=String.valueOf(n) ;
        s=s.replace("0","");
        long ans=Long.parseLong(s);
        return ans;
    }
}