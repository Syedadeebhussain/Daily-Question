// Last updated: 23/12/2025, 4:29:12 pm
1import java.util.*;
2class Solution {
3    int[] primes = {2, 3, 5, 7};
4    int max = 7;
5    public String smallestNumber(String num, long t) {
6        int[] need = new int[max + 1];
7        int n = num.length();
8        int minLen;
9        int pos = 0;
10        for (int p : primes) {
11            while (t % p == 0) {
12                t /= p;
13                need[p]++;
14            }
15        }
16        if (t != 1) return "-1";
17        minLen = minDigits(need);
18        if (n < minLen) {
19            return makeSuffix(need, minLen, new char[minLen]);
20             }
21        char[] ans = new char[n + 1];
22        for (int i = 0;
23             pos < n && (ans[++i] = num.charAt(pos)) != '0';
24             pos++) {
25            useDigit(need, ans[i], -1);
26         }
27        if (minDigits(need) == 0) {
28            if (pos == n) return num;
29            Arrays.fill(ans, ++pos, ans.length, '1');
30            return new String(ans, 1, n);
31                         }
32        for (int last = n - 1, i = Math.min(pos, last); i >= 0; i--) {
33            for (useDigit(need, ans[i + 1], 1);
34                 ++ans[i + 1] <= '9';
35                 useDigit(need, ans[i + 1], 1)) {
36                useDigit(need, ans[i + 1], -1);
37                if (minDigits(need) <= last - i) {
38                    return makeSuffix(need, last - i, ans);
39                }
40                 }
41                }
42        return makeSuffix(need, ans.length, ans);
43    }
44    void useDigit(int[] need, int ch, int add) {
45        if (ch < '2') return;
46        if (ch == '9') need[3] += add * 2;
47        else if (ch == '8') need[2] += add * 3;
48        else if (ch == '6') { need[2] += add; need[3] += add; }
49        else if (ch == '4') need[2] += add * 2;
50        else need[ch - '0'] += add;
51    }
52
53    String makeSuffix(int[] need, int len, char[] ans) {
54        int idx = ans.length;
55        while (need[3] > 1) { need[3] -= 2; ans[--idx] = '9'; }
56        while (need[2] > 2) { need[2] -= 3; ans[--idx] = '8'; }
57        while (need[7]-- > 0) ans[--idx] = '7';
58        if (need[2] > 0 && need[3] > 0) {
59            need[2]--; need[3]--;
60            ans[--idx] = '6';
61        }
62        while (need[5]-- > 0) ans[--idx] = '5';
63        while (need[2] > 1) { need[2] -= 2; ans[--idx] = '4'; }
64        while (need[3]-- > 0) ans[--idx] = '3';
65        while (need[2]-- > 0) ans[--idx] = '2';
66        while (idx + len != ans.length) ans[--idx] = '1';
67        return len == ans.length
68                ? new String(ans)
69                : new String(ans, 1, ans.length - 1);
70    }
71    int minDigits(int[] need) {
72        int two = Math.max(0, need[2]);
73        int three = Math.max(0, need[3]);
74        int mix = (three & 1) + (two % 3);
75        return (three / 2)
76                + (two / 3)
77                + Math.max(0, need[5])
78                + Math.max(0, need[7])
79                + (mix == 3 ? 2 : mix > 0 ? 1 : 0);
80    }
81}
82