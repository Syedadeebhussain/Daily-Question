// Last updated: 26/2/2026, 2:07:49 am
1class Solution {
2    public int maxDistance(int[][] mat) {
3        int n = mat.length, m = mat[0].length;
4        Queue<int[]> q = new LinkedList<>();
5        int[][] dist = new int[n][m];
6        for(int i=0;i<n;i++){
7            for(int j=0;j<m;j++){
8                if(mat[i][j] == 1){
9                    q.add(new int[]{i,j});
10                    dist[i][j] = 0;
11                }else{
12                    dist[i][j] = -1;
13                }
14            }
15        }
16        if(q.isEmpty() || q.size() == n*m) return -1;
17        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
18        while(!q.isEmpty()){
19            int[] rm = q.poll();
20            int x = rm[0], y = rm[1];
21            for(int[] d: dirs){
22                int nx = x + d[0];
23                int ny = y + d[1];
24                if(nx>=0 && nx<n && ny>=0 && ny<m && dist[nx][ny] == -1){
25                    dist[nx][ny] = dist[x][y] + 1;
26                    q.add(new int[]{nx,ny});
27                }
28            }
29        }
30
31        int max = -1;
32        for(int i=0;i<n;i++){
33            for(int j=0;j<m;j++){
34                max = Math.max(max, dist[i][j]);
35            }
36        }
37
38        return max;
39    }
40}