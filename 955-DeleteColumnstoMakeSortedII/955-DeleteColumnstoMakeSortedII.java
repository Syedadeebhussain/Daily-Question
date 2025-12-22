// Last updated: 22/12/2025, 2:22:07 pm
1class Solution {
2    public int minDeletionSize(String[] strs) {
3        int n = strs.length;
4        int m = strs[0].length();
5        boolean[] sorted = new boolean[n - 1];
6        int d = 0;
7        for (int col = 0; col < m; col++) {
8            boolean Delete = false;
9            for (int row = 0; row < n - 1; row++) {
10                if (!sorted[row] && 
11                    strs[row].charAt(col) > strs[row + 1].charAt(col)) {
12                    Delete = true;
13                    break;
14                }
15            }
16
17            if (Delete) {
18                d++;
19            } else {
20                for (int row = 0; row < n - 1; row++) {
21                    if (!sorted[row] && 
22                        strs[row].charAt(col) < strs[row + 1].charAt(col)) {
23                        sorted[row] = true;
24                    }
25                }
26            }
27        }
28        return d;
29    }
30}
31