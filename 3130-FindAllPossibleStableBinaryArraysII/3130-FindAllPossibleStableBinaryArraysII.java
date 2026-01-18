// Last updated: 18/1/2026, 10:20:41 pm
1class Solution {
2    static final int M = 1000000007;
3    public int numberOfStableArrays(int zero, int one, int limit) {
4        long[][][] dp = new long[zero + 1][one + 1][2];
5        long[][] pref0 = new long[zero + 1][one + 1]; // for dp ending in 0
6        long[][] pref1 = new long[zero + 1][one + 1]; // for dp ending in 1
7        dp[0][0][0] = 1;
8        dp[0][0][1] = 1;
9        for (int z = 0; z <= zero; z++) {
10            for (int o = 0; o <= one; o++) {
11                if (z == 0 && o == 0) {
12                    pref0[z][o] = dp[z][o][0];
13                    pref1[z][o] = dp[z][o][1];
14                    continue;
15                }
16                if (z > 0) {
17                    int left = Math.max(0, z - limit);
18                    long val = pref0[z - 1][o];
19                    if (left > 0) {
20                        val = (val - pref0[left - 1][o] + M) % M;
21                    }
22                    dp[z][o][1] = val;
23                }
24                if (o > 0) {
25                    int down = Math.max(0, o - limit);
26                    long val = pref1[z][o - 1];
27                    if (down > 0) {
28                        val = (val - pref1[z][down - 1] + M) % M;
29                    }
30                    dp[z][o][0] = val;
31                }
32                pref0[z][o] = dp[z][o][0];
33                pref1[z][o] = dp[z][o][1];
34                if (z > 0) pref0[z][o] = (pref0[z][o] + pref0[z - 1][o]) % M;
35                if (o > 0) pref1[z][o] = (pref1[z][o] + pref1[z][o - 1]) % M;
36            }
37        }
38        return (int) ((dp[zero][one][0] + dp[zero][one][1]) % M);
39    }
40}
41