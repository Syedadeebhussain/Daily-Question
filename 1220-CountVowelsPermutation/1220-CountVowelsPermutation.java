// Last updated: 2/9/2026, 7:18:43 pm
1class Solution {
2    static int[][] dp;
3    static final int MOD = 1000000007;
4    public int countVowelPermutation(int n) {
5        char[] arr = {'a', 'e', 'i', 'o', 'u'};
6        dp = new int[n + 1][6];
7        for (int[] a : dp) {
8            Arrays.fill(a, -1);
9        }
10        int ll = Solve(arr, n, 5);
11        return ll;
12    }
13    public static int Solve(char[] arr, int n, int prev) {
14        if (n == 0) {
15            return 1;
16        }
17        if (dp[n][prev] != -1) {
18            return dp[n][prev];
19        }
20        long c = 0;
21        for (int i = 0; i < 5; i++) {
22            if (prev == 5) {
23                c += Solve(arr, n - 1, i);
24            }
25            else if (prev == 0 && i == 1) {
26                c += Solve(arr, n - 1, i);
27            }
28            else if (prev == 1 && (i == 0 || i == 2)) {
29                c += Solve(arr, n - 1, i);
30            }
31            else if (prev == 2 && (i == 0 || i == 1 || i == 3 || i == 4)) {
32                c += Solve(arr, n - 1, i);
33            }
34            else if (prev == 3 && (i == 2 || i == 4)) {
35                c += Solve(arr, n - 1, i);
36            }
37            else if (prev == 4 && i == 0) {
38                c += Solve(arr, n - 1, i);
39            }
40            c %= MOD;
41        }
42        return dp[n][prev] = (int)c;
43    }
44}