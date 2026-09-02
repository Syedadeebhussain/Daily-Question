// Last updated: 2/9/2026, 7:48:01 pm
1import java.util.*;
2class Solution {
3    static int[][] dp;
4    boolean flag = true;
5     public int findLength(int[] s1, int[] s2){
6     dp = new int[s1.length][s2.length];
7        for (int[] a : dp) {
8            Arrays.fill(a, -1);
9        }
10    int ans = 0;
11    for (int i = 0; i < s1.length; i++) {
12    for (int j = 0; j < s2.length; j++) {
13        ans = Math.max(ans, Solve(s1, s2, i, j));
14        }
15    }
16    return ans;
17    }
18    public int Solve(int[] a, int[] b, int i, int j) {
19        if (i >= a.length || j >= b.length) {
20            return 0;
21        }
22           if (dp[i][j] != -1) {
23        return dp[i][j];
24    }
25        if (a[i] == b[j]) {
26            dp[i][j] = 1 + Solve(a, b, i + 1, j + 1);
27        }
28        else {
29                dp[i][j] = 0;
30        }
31        return dp[i][j];
32    }
33}