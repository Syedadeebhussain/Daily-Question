// Last updated: 16/1/2026, 9:57:54 pm
1class Solution {
2    public int countHousePlacements(int n) {
3        long MOD = 1_000_000_007;
4        long prev2 = 1; 
5        long prev1 = 2; 
6        for (int i = 2; i <= n; i++) {
7            long curr = (prev1 + prev2) % MOD;
8            prev2 = prev1;
9            prev1 = curr;
10        }
11        long oneSideWays = prev1;
12        return (int) ((oneSideWays * oneSideWays) % MOD);
13    }
14}
15