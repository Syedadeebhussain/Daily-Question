// Last updated: 13/1/2026, 11:08:01 am
1// class Solution {
2//     public int maxProfit(int[] prices) {
3//     int max=Integer.MIN_VALUE;
4//     int min=Integer.MAX_VALUE;
5//     int p=0;
6//     for(int j:prices)
7//     {
8//      if(j<=min)
9//      {
10//         min=j;
11//      }
12//      p=j-min;
13//      max=Math.max(max,p);
14//     }
15//     return max;
16
17//     }
18// }
19class Solution {
20    public int maxProfit(int[] nums) {
21        long[][] dp = new long[nums.length][2];
22        for (long[] a : dp) Arrays.fill(a, -1);
23        return (int) Solve(nums, 0, 0, dp);
24    }
25
26    public long Solve(int[] nums, int i, int state, long[][] dp) {
27        if (i == nums.length) return 0;
28        if (dp[i][state] != -1)
29            return dp[i][state];
30
31        long skip = Solve(nums, i + 1, state, dp);
32        long take;
33        if (state == 0) {
34            take = -nums[i] + Solve(nums, i + 1, 1, dp);
35        } else { 
36            take = nums[i];   
37        }
38
39        return dp[i][state] = Math.max(skip, take);
40    }
41}
42