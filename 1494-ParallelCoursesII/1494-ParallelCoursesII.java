// Last updated: 17/1/2026, 11:10:19 pm
1class Solution {
2    public int minNumberOfSemesters(int n, int[][] relations, int k) {
3        int[] prereq = new int[n];
4        for (int[] r : relations) {
5            int u = r[0] - 1;
6            int v = r[1] - 1;
7            prereq[v] |= (1 << u);
8        }
9        int N = 1 << n;
10        int[] dp = new int[N];
11        Arrays.fill(dp, Integer.MAX_VALUE);
12        dp[0] = 0;
13        for (int mask = 0; mask < N; mask++) {
14            if (dp[mask] == Integer.MAX_VALUE) continue;
15            int available = 0;
16            for (int i = 0; i < n; i++) {
17                if ((mask & (1 << i)) == 0 &&
18                    (prereq[i] & mask) == prereq[i]) {
19                    available |= (1 << i);
20                }
21            }
22            int cnt = Integer.bitCount(available);
23            if (cnt <= k) {
24                int nextMask = mask | available;
25                dp[nextMask] = Math.min(dp[nextMask], dp[mask] + 1);
26            }
27            else {
28                for (int sub = available; sub > 0; sub = (sub - 1) & available) {
29                    if (Integer.bitCount(sub) == k) {
30                        int nextMask = mask | sub;
31                        dp[nextMask] = Math.min(dp[nextMask], dp[mask] + 1);
32                    }
33                }
34            }
35        }
36        return dp[N - 1];
37    }
38}
39