// Last updated: 27/7/2026, 12:27:31 am
1class Solution {
2    public int maximumProduct(int[] nums) {
3      Arrays.sort(nums);
4      int ans=nums[0]*nums[1]*nums[nums.length-1];
5        int p=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
6        ans=Math.max(ans,p);
7        return ans;
8
9    }
10}