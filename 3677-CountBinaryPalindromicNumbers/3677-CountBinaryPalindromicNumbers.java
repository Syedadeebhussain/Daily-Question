// Last updated: 26/12/2025, 10:50:02 pm
1class Solution {
2    public int countBinaryPalindromes(long n) {
3        if (n == 0) return 1;
4        String s = Long.toBinaryString(n);
5        int len = s.length();
6        long ans = 1;
7        for (int l = 1; l < len; l++) {
8            int h = (l + 1) / 2;
9            ans += (1L << (h - 1));
10        }
11        int h = (len + 1) / 2;
12        long fh = Long.parseLong(s.substring(0, h), 2);
13        long base = 1L << (h - 1);
14        ans += (fh - base);
15        long p = makePal(fh, len % 2 == 1);
16        if (p <= n) ans++;
17        return (int) ans;
18    }
19    public long makePal(long x, boolean odd) {
20        long res = x;
21        if (odd) x >>= 1;
22        while (x > 0) {
23            res = (res << 1) | (x & 1);
24            x >>= 1;
25        }
26        return res;
27    }
28}
29