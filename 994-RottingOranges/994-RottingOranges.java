// Last updated: 30/12/2025, 4:13:56 pm
1class Solution {
2    public int orangesRotting(int[][] grid) {
3        int n = grid.length;
4        int m = grid[0].length;
5        Queue<int[]> q = new LinkedList<>();
6        int fresh = 0;
7        for (int i = 0; i < n; i++) {
8            for (int j = 0; j < m; j++) {
9                if (grid[i][j] == 2) {
10                    q.offer(new int[]{i, j});
11                } else if (grid[i][j] == 1) {
12                    fresh++;
13                }
14            }
15        }
16        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
17        int time = 0;
18        while (!q.isEmpty() && fresh > 0) {
19            int size = q.size();
20            time++;
21            for (int i = 0; i < size; i++) {
22                int[] cur = q.poll();
23                int x = cur[0];
24                int y = cur[1];
25                for (int[] d : dirs) {
26                int nx = x + d[0];
27                int ny = y + d[1];
28            if (nx >= 0 && nx < n && ny >= 0 && ny < m && grid[nx][ny] == 1) {
29                        grid[nx][ny] = 2; 
30                        fresh--;
31                        q.offer(new int[]{nx, ny});
32                    }
33                }
34            }
35        }
36    return fresh == 0 ? time : -1;
37    }
38}
39