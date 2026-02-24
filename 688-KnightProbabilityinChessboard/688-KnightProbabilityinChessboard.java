// Last updated: 24/2/2026, 4:43:28 pm
1class Solution {
2    double[][][] dp;
3    public double knightProbability(int n, int k, int row, int column) {
4        dp = new double[n][n][k + 1];
5        for (int i = 0; i < n; i++) {
6            for (int j = 0; j < n; j++) {
7                Arrays.fill(dp[i][j], -1);
8            }
9        }
10        return Solve(n, k, row, column);
11    }
12    public double Solve(int n, int k, int r, int c) {
13        if (r < 0 || r >= n || c < 0 || c >= n) return 0;
14        if (k == 0) return 1;
15        if (dp[r][c][k] != -1) return dp[r][c][k];
16        int[] row = {2, 2, -2, -2, 1, 1, -1, -1};
17        int[] col = {1, -1, 1, -1, 2, -2, 2, -2};
18        double sum = 0;
19        for (int i=0;i<8;i++) {
20            sum+=Solve(n,k-1,r+row[i],c+col[i]);
21        }
22        return dp[r][c][k] = sum / 8.0;
23    }
24}