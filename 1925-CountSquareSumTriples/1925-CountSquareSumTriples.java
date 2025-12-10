// Last updated: 10/12/2025, 11:06:36 pm
1class Solution {
2    public int countTriples(int n) {
3        int c = 0;
4        for (int i = 1; i <= n; i++) {
5            for (int j = i; j <= n; j++) {
6                for (int k = i; k <= n; k++) {
7                    if (i*i + j*j == k*k) {
8                        c += 1;
9                    }
10                    if (i*i == j*j + k*k) {
11                        c += 1;
12                    }
13                    if (i*i + k * k == j*j) {
14                        c += 1;
15                    }
16                }
17            }
18        }
19        return c;
20    }
21}