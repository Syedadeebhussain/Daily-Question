// Last updated: 3/1/2026, 1:03:50 pm
1class Solution {
2    public int maximumSafenessFactor(List<List<Integer>> grid) {
3        int m = grid.size();
4        int n = grid.get(0).size();
5        int[][] safety = new int[m][n];
6        for (int[] row : safety) {
7            Arrays.fill(row, Integer.MAX_VALUE);
8        }
9        int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};
10        Queue<int[]> q = new LinkedList<>();
11        for (int i = 0; i < m; i++) {
12            for (int j = 0; j < n; j++) {
13                if (grid.get(i).get(j) == 1) {
14                    safety[i][j] = 0;
15                    q.add(new int[]{i, j});
16                }
17            }
18        }
19        while (!q.isEmpty()) {
20            int[] rm = q.poll();
21            int x = rm[0], y = rm[1];
22            for (int[] d : dirs) {
23                int nx = x + d[0];
24                int ny = y + d[1];
25                if (nx >= 0 && nx < m && ny >= 0 && ny < n &&
26                    safety[nx][ny] > safety[x][y] + 1) {
27                    safety[nx][ny] = safety[x][y] + 1;
28                    q.add(new int[]{nx, ny});
29                }
30            }
31        }
32
33        int[][] dist = new int[m][n];
34        for (int[] row : dist) {
35            Arrays.fill(row, Integer.MIN_VALUE);
36        }
37        PriorityQueue<int[]> pq =new PriorityQueue<>((a, b) -> b[2] - a[2]);
38        dist[0][0] = safety[0][0];
39        pq.add(new int[]{0, 0, dist[0][0]});
40        while (!pq.isEmpty()) {
41            int[] rm = pq.poll();
42            int x = rm[0], y = rm[1], dis = rm[2];
43            if (x == m - 1 && y == n - 1) return dis;
44            for (int[] d : dirs) {
45                int nx = x + d[0];
46                int ny = y + d[1];
47                if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
48                    int newcost = Math.min(dis, safety[nx][ny]);
49                    if (newcost > dist[nx][ny]) {
50                        dist[nx][ny] = newcost;
51                        pq.add(new int[]{nx, ny, newcost});
52                    }
53                }
54            }
55        }
56
57        return -1;
58    }
59}
60