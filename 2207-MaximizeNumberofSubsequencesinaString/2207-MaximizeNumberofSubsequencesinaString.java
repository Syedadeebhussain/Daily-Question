// Last updated: 28/12/2025, 9:18:06 pm
1class Solution {
2    public long maximumSubsequenceCount(String text, String pattern) {
3        char x = pattern.charAt(0);
4        char y = pattern.charAt(1);
5        long cX = 0;
6        long cY = 0;
7        long e = 0;
8        for (char ch : text.toCharArray()) {
9            if (ch == y) {
10                e += cX;
11                cY++;
12            }
13            if (ch == x) {
14                cX++;
15            }
16        }
17        long o1 = e + cY;
18        long o2 = e + cX;
19        return Math.max(o1, o2);
20    }
21}
22