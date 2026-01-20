// Last updated: 20/1/2026, 11:21:53 pm
1class Solution {
2    public int maximumStrongPairXor(int[] nums) {
3        int ans = 0;
4        for(int i = 0; i < nums.length;i++) {
5            int x = nums[i];
6            for(int j = i+1; j < nums.length; j++) {
7                int y = nums[j];
8                if(Math.abs(x-y) <= Math.min(x, y)){
9                    ans = Math.max(x^y, ans);
10                }
11            }
12        }
13        return ans;
14    }
15}