// Last updated: 31/1/2026, 10:48:50 pm
1class Solution {
2    static final long MOD = 1_000_000_007;
3    public int minNonZeroProduct(int p) {
4        long M = (1L << p) - 1;  
5        long base = M - 1;
6        long exp = M / 2;
7        long power = modPow(base, exp);
8        long result = (power * (M % MOD)) % MOD;
9        return (int) result;
10    }
11    public long modPow(long base, long exp) {
12        long result = 1;
13        base %= MOD;
14        while (exp>0) {
15            if ((exp&1)==1) {
16                result=(result*base)%MOD;
17            }
18            base=(base*base)%MOD;
19            exp>>=1;
20        }
21        return result;
22    }
23}
24