// Last updated: 7/1/2026, 11:13:19 pm
1class Solution {
2    int[][] dp;
3    public int minCost(int n, int[] cuts) {
4        int m = cuts.length;
5        int[] cut = new int[m+2];
6        cut[0] = 0;
7        cut[m+1] = n;
8        for (int i=1;i<=m;i++) {
9            cut[i] = cuts[i-1];
10        }
11        Arrays.sort(cut);
12        dp = new int[m+2][m+2];
13        for (int[] row : dp) {
14            Arrays.fill(row, -1);
15        }
16        return solve(cut, 1, m);
17    }
18
19    public int solve(int[] arr, int i, int j) {
20        if (i > j) return 0;
21        if (dp[i][j] != -1) return dp[i][j];
22        int min = Integer.MAX_VALUE;
23        for (int k = i; k <= j; k++) {
24            int cost = (arr[j + 1] - arr[i - 1])+ solve(arr, i, k - 1)+ solve(arr, k + 1, j);
25            min = Math.min(min, cost);
26        }
27        return dp[i][j] = min;
28    }
29}
30