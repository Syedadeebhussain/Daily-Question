// Last updated: 31/1/2026, 1:01:59 pm
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int xor=0;
4        for(int i:nums){
5            xor^=i;
6        }
7        return xor;
8    }
9}