// Last updated: 29/11/2025, 8:08:36 am
1class Solution {
2    public int minOperations(int[] nums, int k) {
3      int s = 0;
4        for(int i=0; i<nums.length; i++){
5            s += nums[i];
6        }
7        if(s%k == 0){
8            return 0;
9        }else{
10            return s%k;
11        }
12    }
13}