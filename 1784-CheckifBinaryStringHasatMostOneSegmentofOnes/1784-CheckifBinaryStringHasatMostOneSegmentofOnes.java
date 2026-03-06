// Last updated: 6/3/2026, 10:06:59 pm
1class Solution {
2    public boolean checkOnesSegment(String s) {
3     for(int i=0;i<s.length()-1;i++){
4        if(s.charAt(i)=='0' && s.charAt(i+1)=='1')  return false;
5     }
6     return true;
7    }
8}