// Last updated: 27/12/2025, 9:54:15 pm
1class Solution {
2    public long numberOfSubarrays(int[] arr) {
3        int n = arr.length;
4        long res = 0;
5        int[] st = new int[n];
6        long[] cnt = new long[n];
7        int top = -1;
8        for (int x:arr) {
9            while(top>=0 &&st[top]<x){
10                top--;
11            }
12            if(top>=0 &&st[top]==x) {
13                cnt[top]++;
14            }
15             else{
16                st[++top]=x;
17                cnt[top]=1;
18            }
19            res+=cnt[top];
20        }
21        return res;
22    }
23}
24