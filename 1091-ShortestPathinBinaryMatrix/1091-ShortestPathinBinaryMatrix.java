// Last updated: 1/1/2026, 12:47:09 pm
1class Solution {
2    public int shortestPathBinaryMatrix(int[][] grid) {
3    int m=grid.length;
4    int n=grid.length;
5    if(grid[0][0]==1 || grid[m-1][n-1]==1) return -1;
6    Queue<int []> q=new LinkedList<>();
7    q.add(new int[] {0,0,1}); //(i,s,step);
8    int[][] dirs = {{-1,  0}, { 1,  0}, { 0, -1}, { 0,  1},{-1, -1},{-1,  1},{ 1, -1},{ 1,  1}};
9    while(!q.isEmpty()){
10        int [] rm=q.poll();
11        int x=rm[0];
12        int y=rm[1];
13        int st=rm[2];
14        if(x==m-1 && y==n-1) return st;
15        for(int [] d:dirs ){
16            int nx = x + d[0];
17            int ny = y + d[1];
18            if (nx >= 0 && nx < n && ny >= 0 && ny < m && grid[nx][ny]==0){
19                    grid[nx][ny]=1;
20                    q.add(new int []{nx,ny,st+1});
21            }
22        }
23    }
24    return -1;
25
26    }
27}