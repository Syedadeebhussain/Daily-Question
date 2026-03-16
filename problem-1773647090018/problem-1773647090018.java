// Last updated: 16/3/2026, 1:14:50 pm
1class Solution {
2    public int countCommas(int n) {
3    int ans=0;
4        for(int i=1000;i<=n;i++){
5            String di=String.valueOf(i);
6                ans+=(di.length()-1)/3;
7        }
8        return ans;
9    }
10}