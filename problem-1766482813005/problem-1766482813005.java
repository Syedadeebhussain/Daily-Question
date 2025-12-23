// Last updated: 23/12/2025, 3:10:13 pm
1class Solution {
2    public int numWays(String s) {
3         int MOD = 1000000007;
4        int n = s.length();
5        int ones = 0;
6        for (char c : s.toCharArray()) {
7            if (c == '1') ones++;
8        }
9        if (ones % 3 != 0) return 0;
10        if (ones == 0) {
11            long ways = (long)(n - 1) * (n - 2) / 2;
12            return (int)(ways % MOD);
13        }
14        int part = ones / 3;
15        int seen = 0;
16        long first = 0;
17        long second = 0;
18        for (int i = 0; i < n; i++) {
19            if (s.charAt(i) == '1') {
20                seen++;
21                if (seen == part) {
22                    int k = i + 1;
23                    while (k < n && s.charAt(k) == '0') {
24                        first++;
25                        k++;
26                    }
27                }
28                if (seen == 2 * part) {
29                    int k = i + 1;
30                    while (k < n && s.charAt(k) == '0') {
31                        second++;
32                        k++;
33                    }
34                }
35                }
36                  }
37        long answer = (first + 1) * (second + 1);
38        return (int)(answer % MOD);
39    }
40}
41