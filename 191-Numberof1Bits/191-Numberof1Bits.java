// Last updated: 6/8/2025, 12:49:36 pm
class Solution {
    public int hammingWeight(int n) {
        int c=0;
        String s=Integer.toBinaryString(n);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') c++;
        }
        return c;
    }
}