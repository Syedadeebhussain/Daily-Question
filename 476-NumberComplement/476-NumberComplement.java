// Last updated: 19/1/2026, 1:18:10 pm
1class Solution {
2    public int findComplement(int num) {
3        int bits = 0;
4        int n = num;
5        while (n > 0) {
6            n >>= 1;
7            bits++;
8        }
9        int mask = (1 << bits) - 1;
10        return num ^ mask;
11    }
12}
13