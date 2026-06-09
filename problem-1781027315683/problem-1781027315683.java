// Last updated: 9/6/2026, 11:18:35 pm
1class Solution {
2    public long maxTotalValue(int[] nums, int k) {
3      int max=Integer.MIN_VALUE;
4        int min=Integer.MAX_VALUE;
5        for(int i=0;i<nums.length;i++){
6            max=Math.max(max,nums[i]);
7            min=Math.min(min,nums[i]);
8        }
9        long ans=(long)max-(long)min;
10        return ans*k;
11    }
12}