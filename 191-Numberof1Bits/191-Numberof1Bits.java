// Last updated: 20/1/2026, 9:08:17 pm
1class Solution {
2    public int hammingWeight(int n) {
3        int c=0;
4        while(n!=0){
5            c+=n&1;
6            n=n>>1;
7        }
8        return c;
9    }
10}