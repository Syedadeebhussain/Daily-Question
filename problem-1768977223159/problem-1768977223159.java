// Last updated: 21/1/2026, 12:03:43 pm
1class Solution {
2    public int getXORSum(int[] arr1, int[] arr2) {
3     int xor1=0;
4     for(int x:arr1){
5        xor1^=x;
6     }   
7     int xor2=0;
8     for(int y:arr2){
9        xor2^=y;
10     }
11     return xor1&xor2;
12    }
13}