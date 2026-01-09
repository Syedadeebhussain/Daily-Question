// Last updated: 9/1/2026, 11:43:34 am
1class Solution {
2    int[] dp;
3    public String stoneGameIII(int[] stoneValue) {
4        dp = new int[stoneValue.length];
5        Arrays.fill(dp, -1);
6        int ans = Solve(stoneValue, 0);
7        if (ans == 0) return "Tie";
8        else if (ans > 0) return "Alice";
9        else return "Bob";
10    }
11
12    public int Solve(int[] arr, int i) {
13        if (i >= arr.length) return 0;
14        if (dp[i] != -1) return dp[i];
15        int max = Integer.MIN_VALUE;
16        int a = arr[i] - Solve(arr, i + 1);
17        int b = Integer.MIN_VALUE;
18        if (i + 1 < arr.length) {
19            b = arr[i] + arr[i + 1] - Solve(arr, i + 2);
20        }
21        int c = Integer.MIN_VALUE;
22        if (i + 2 < arr.length) {
23            c = arr[i] + arr[i + 1] + arr[i + 2] - Solve(arr, i + 3);
24        }
25        max = Math.max(a, Math.max(b, c));
26        return dp[i] = max;
27    }
28}
29