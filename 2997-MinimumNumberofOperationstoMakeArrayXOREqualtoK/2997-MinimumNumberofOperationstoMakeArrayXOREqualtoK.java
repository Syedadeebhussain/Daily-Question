// Last updated: 22/1/2026, 11:57:15 pm
1class Solution {
2    public int minOperations(int[] nums, int k) {
3        int xor=0;
4      for(int i:nums){
5        xor^=i;
6      }  
7      return Integer.bitCount(xor^k);
8    }
9}