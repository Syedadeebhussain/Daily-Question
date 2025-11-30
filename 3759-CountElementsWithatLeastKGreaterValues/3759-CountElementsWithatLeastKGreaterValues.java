// Last updated: 30/11/2025, 10:26:58 pm
1class Solution {
2    public int countElements(int[] nums, int k) {
3        if (k == 0) return nums.length;
4        Arrays.sort(nums);
5        int n = nums.length;
6        int t = nums[n - k];
7        int c= 0;
8        for (int x : nums) {
9            if (x <t) {
10                c++;
11            }
12        }
13        return c;
14    }
15}