// Last updated: 19/1/2026, 1:22:32 pm
1class Solution {
2    public int bitwiseComplement(int num) {
3        if(num==0 )return 1;
4       int bits = 0;
5        int n1 = num;
6        while (n1 > 0) {
7            n1 >>= 1;
8            bits++;
9        }
10        int mask = (1 << bits) - 1;
11        return num ^ mask;
12    }
13}
14