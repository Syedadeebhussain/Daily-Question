// Last updated: 21/1/2026, 10:42:47 pm
1class Solution {
2    public int largestVariance(String s) {
3        int ans = 0;
4        for (char a = 'a'; a <= 'z';a++) {
5            for (char b = 'a'; b <= 'z'; b++) {
6                if (a == b) continue;
7                ans = Math.max(ans, kadane(s, a, b));
8                ans = Math.max(ans, kadane(new StringBuilder(s).reverse().toString(), a, b));
9            }
10        }
11
12        return ans;
13    }
14    private int kadane(String s, char a, char b) {
15        int countA = 0;
16        int countB = 0;
17        int best = 0;
18        boolean hasB = false;
19        for (int i = 0; i < s.length(); i++) {
20            char c = s.charAt(i);
21            if (c == a) countA++;
22            if (c == b) {
23                countB++;
24                hasB = true;
25            }
26            if (hasB) {
27                best = Math.max(best, countA - countB);
28            }
29
30            if (countA < countB) {
31                countA = 0;
32                countB = 0;
33                hasB = false;
34            }
35        }
36        return best;
37    }
38}
39