// Last updated: 24/4/2026, 11:06:43 pm
1class Solution {
2    public int furthestDistanceFromOrigin(String moves) {
3              int left = 0, right = 0, blanks = 0;
4
5        for (char c : moves.toCharArray()) {
6            if (c == 'L') left++;
7            else if (c == 'R') right++;
8            else blanks++;
9        }
10
11        return Math.abs(left - right) + blanks;
12    }
13}
14