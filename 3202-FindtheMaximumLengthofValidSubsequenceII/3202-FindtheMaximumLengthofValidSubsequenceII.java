// Last updated: 9/1/2026, 10:31:04 pm
1//this Q is almost similar to 1027. Longest Arithmetic Subsequence
2class Solution {
3    public int maximumLength(int[] nums, int k) {
4        int n = nums.length;
5        int[][] dp = new int[n][k];
6        for(int[] a : dp){
7            Arrays.fill(a,1);
8        }
9        int ans = 1;
10        for(int i = 0; i<n; i++){
11            for(int j = 0; j<i; j++){
12                int diff = (nums[i]+nums[j])%k;
13                dp[i][diff] = Math.max(dp[i][diff],dp[j][diff]+1);
14                ans = Math.max(ans,dp[i][diff]);
15            }
16        }
17        return ans;
18    }
19}