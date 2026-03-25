// Last updated: 25/3/2026, 8:09:04 pm
1class Solution {
2    public boolean canPartitionGrid(int[][] grid) {
3        long[] horizontal = new long[grid.length + 1];
4        long[] vertical = new long[grid[0].length + 1];
5        int m = grid.length;
6        int n = grid[0].length;
7        horizontal[0] = 0;
8        for (int i = 0; i < m; i++) {
9            long sum = 0;
10            for (int j = 0; j < n; j++) {
11                sum += grid[i][j];
12            }
13            horizontal[i + 1] = horizontal[i] + sum;
14        }
15        vertical[0] = 0;
16        for (int i = 0; i < n; i++) {
17            long sum = 0;
18            for (int j = 0; j < m; j++) {
19                sum += grid[j][i];
20            }
21            vertical[i + 1] = vertical[i] + sum;
22        }
23        long total = horizontal[m];
24        if (total % 2 != 0) return false;
25        long target = total / 2;
26        for (int i = 1; i < m; i++) {
27            if (horizontal[i] == target) return true;
28        }
29        for (int i = 1; i < n; i++) {
30            if (vertical[i] == target) return true;
31        }
32        return false;
33    }
34}