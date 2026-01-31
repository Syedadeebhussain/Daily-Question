// Last updated: 31/1/2026, 10:56:21 pm
1class Solution {
2    public int findMinimumTime(List<Integer> strength, int k) {
3        int n = strength.size();
4        int[][] cost = new int[n + 1][n + 1];
5        for(int i = 0; i < n; i++) {
6            for(int j = 0; j < n; j++) cost[i + 1][j + 1] = (strength.get(i) + j * k) / (j * k + 1);
7        }
8        return hungarian(cost);
9    }
10    private int hungarian(int[][] cost) {
11        int n = cost.length, m = cost[0].length;
12        int[] u = new int[n], v = new int[m], p = new int[m], way = new int[m];
13        for(int i = 1; i < n; i++) {
14            p[0] = i;
15            int j0 = 0;
16            int[] min = new int[m];
17            boolean[] seen = new boolean[m];
18            Arrays.fill(min, Integer.MAX_VALUE);
19            while(p[j0] != 0) {
20                seen[j0] = true;
21                int i0 = p[j0], current = Integer.MAX_VALUE, minCol = 0;
22                for(int j = 1; j < m; j++) {
23                    if(!seen[j]) {
24                        int val = cost[i0][j] - u[i0] - v[j];
25                        if(val < min[j]) {
26                            min[j] = val;
27                            way[j] = j0;
28                        }
29                        if(min[j] < current) {
30                            current = min[j];
31                            minCol = j;
32                        }
33                    }
34                }
35                for(int j = 0; j < m; j++) {
36                    if(seen[j]) {
37                        u[p[j]] += current;
38                        v[j] -= current;
39                    }else min[j] -= current;
40                }
41                j0 = minCol;
42            }
43            int temp = way[j0];
44            p[j0] = p[temp];
45            j0 = temp;
46            while(j0 != 0) {
47                temp = way[j0];
48                p[j0] = p[temp];
49                j0 = temp;
50            }
51        }
52        return -v[0];
53    }
54}