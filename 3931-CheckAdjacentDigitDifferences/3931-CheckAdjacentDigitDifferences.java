// Last updated: 18/5/2026, 12:32:50 pm
1class Solution {
2    public boolean isAdjacentDiffAtMostTwo(String s) {
3     for(int i=0;i<s.length()-1;i++){
4        int diff=Math.abs((s.charAt(i)-'0')-(s.charAt(i+1)-'0'));
5        if(diff>2)return false;
6     }   
7     return true;
8    }
9}