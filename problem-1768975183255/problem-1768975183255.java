// Last updated: 21/1/2026, 11:29:43 am
1class Solution {
2    public boolean doesValidArrayExist(int[] derived) {
3        int sum=0;
4        for(int i=0;i<derived.length;i++){
5                 sum^=derived[i];
6          
7        }
8        return sum==0;
9    }
10}