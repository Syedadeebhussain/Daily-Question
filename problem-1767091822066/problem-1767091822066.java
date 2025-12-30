// Last updated: 30/12/2025, 4:20:22 pm
1class Solution {
2    public int[][] highestPeak(int[][] mat) {
3        int n = mat.length;
4        int m = mat[0].length;
5        Queue<int[]> q = new LinkedList<>();
6        int[][] dist = new int[n][m]; 
7        int[][] dirs = {{1, 0},{-1, 0},{0, 1},{0, -1}};
8        for(int i=0;i<mat.length;i++){
9            for(int j=0;j<mat[0].length;j++){
10                if(mat[i][j]==1){
11                    q.add(new int[]{i,j});
12                }
13                else{
14                    dist[i][j]=-1;
15                }
16            }
17        }
18        while(!q.isEmpty()){
19            int [] rm=q.poll();
20            int x=rm[0];
21            int y=rm[1];
22            for(int [] dir:dirs){
23                int nx=x+dir[0];
24                int ny=y+dir[1];
25                if(nx>=0 && nx<n && ny>=0 && ny<m && dist[nx][ny]==-1 ){
26                    dist[nx][ny]=dist[x][y]+1;
27                    q.add(new int[]{nx, ny});
28                }
29            }
30        }
31        return dist;
32    }
33}