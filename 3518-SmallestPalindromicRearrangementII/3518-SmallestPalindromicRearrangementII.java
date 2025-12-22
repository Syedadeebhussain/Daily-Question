// Last updated: 22/12/2025, 3:32:04 pm
1class Solution {
2
3    static long LIMIT = 1000001;
4
5    public String smallestPalindrome(String s, int k) {
6
7        int[] cnt = new int[26];
8        for (int i = 0; i < s.length(); i++) {
9            cnt[s.charAt(i) - 'a']++;
10        }
11
12        char mid = 0;
13        for (int i = 0; i < 26; i++) {
14            if (cnt[i] % 2 == 1) {
15                mid = (char) ('a' + i);
16                cnt[i]--;
17                break;
18            }
19        }
20
21        int[] half = new int[26];
22        int len = 0;
23        for (int i = 0; i < 26; i++) {
24            half[i] = cnt[i] / 2;
25            len += half[i];
26        }
27
28        long total = countWays(half);
29        if (k > total) return "";
30
31        StringBuilder left = new StringBuilder();
32
33        for (int i = 0; i < len; i++) {
34            for (int c = 0; c < 26; c++) {
35                if (half[c] > 0) {
36                    half[c]--;
37                    long ways = countWays(half);
38                    if (ways >= k) {
39                        left.append((char) ('a' + c));
40                        break;
41                    } else {
42                        k -= ways;
43                        half[c]++;
44                    }
45                }
46            }
47        }
48
49        String leftStr = left.toString();
50        String rightStr = new StringBuilder(leftStr).reverse().toString();
51
52        return mid == 0 ? leftStr + rightStr : leftStr + mid + rightStr;
53    }
54
55    public long countWays(int[] half) {
56        int total = 0;
57        for (int x : half) total += x;
58
59        long res = 1;
60        for (int i = 0; i < 26; i++) {
61            res *= comb(total, half[i]);
62            if (res >= LIMIT) return LIMIT;
63            total -= half[i];
64        }
65        return res;
66    }
67
68    public long comb(int n, int k) {
69        if (k > n) return 0;
70        if (k > n - k) k = n - k;
71
72        long res = 1;
73        for (int i = 1; i <= k; i++) {
74            res = res * (n - i + 1) / i;
75            if (res >= LIMIT) return LIMIT;
76        }
77        return res;
78    }
79}
80