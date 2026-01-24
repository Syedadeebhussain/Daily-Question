// Last updated: 24/1/2026, 5:00:21 pm
1class Solution {
2    public int minPairSum(int[] nums) {
3       int max=Integer.MIN_VALUE;
4       Arrays.sort(nums);
5       int i=0;
6       int j=nums.length-1;
7       while(i<j){
8         int sum=nums[i]+nums[j];
9         max=Math.max(sum,max);
10         i++;
11         j--;
12       }
13       return max;
14    }
15}