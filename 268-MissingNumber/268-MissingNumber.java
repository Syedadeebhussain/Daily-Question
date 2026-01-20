// Last updated: 20/1/2026, 9:19:50 pm
1class Solution {
2    public int missingNumber(int[] nums) {
3    int xor=0;
4     for(int i=0;i<=nums.length;i++){
5       xor^=i;
6     }   
7     for(int i:nums){
8        xor^=i;
9     }
10     return xor;
11    }
12}