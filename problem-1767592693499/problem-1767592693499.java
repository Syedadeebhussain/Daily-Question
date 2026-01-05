// Last updated: 5/1/2026, 11:28:13 am
1class Solution {
2    public int minimumNumbers(int num, int k) {
3        if (num == 0) return 0;
4        int[] dp = new int[num + 1];
5        Arrays.fill(dp, -1);
6        int ans = solve(num, k, dp);
7        return ans == Integer.MAX_VALUE-1 ? -1 : ans;
8    }
9    public int solve(int num, int k, int[] dp) {
10        if (num == 0) return 0;
11        if (dp[num] != -1) return dp[num];
12        int res = Integer.MAX_VALUE-1;
13        int start = (k == 0) ? 10 : k;
14        for (int x = start; x <= num; x += 10) {
15            int temp = solve(num - x, k, dp);
16            res=Math.min(res,1+temp);
17        }
18
19        return dp[num] = res;
20    }
21}
22