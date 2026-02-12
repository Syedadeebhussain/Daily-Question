// Last updated: 13/2/2026, 12:16:56 am
1class Solution {
2    public int minOperations(int n) {
3     int s=0;
4     for(int i=0;i<n;i++){
5        s+=(i*2)+1;
6     }   
7     s=s/n;
8     int c=0;
9     for(int i=0;i<n;i++){
10       int val=2*i+1;
11       if(val!=s){
12        c+=Math.abs(s-val);
13       }
14     }
15     return c/2;
16    }
17}