// Last updated: 22/1/2026, 10:45:09 pm
1class Solution {
2    public int monkeyMove(int n) {
3        long MOD = 1_000_000_007;
4        long result = modPow(2, n, MOD);
5        return (int)((result - 2 + MOD) % MOD);
6    }
7
8    private long modPow(long base, int exp, long mod) {
9        long result = 1;
10        while (exp > 0) {
11            if ((exp & 1) == 1)
12                result = (result * base) % mod;
13            base = (base * base) % mod;
14            exp >>= 1;
15        }
16        return result;
17    }
18}
19