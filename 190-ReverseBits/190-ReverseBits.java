// Last updated: 16/2/2026, 10:46:35 am
1class Solution {
2    public int reverseBits(int n) {
3    int ans=0;
4     for(int i=0;i<=31;i++){
5        int last_bit=n&1;
6         n=n>>1;
7        ans=ans<<1;
8        ans=ans|last_bit;
9     }   
10     return ans;
11    }
12}