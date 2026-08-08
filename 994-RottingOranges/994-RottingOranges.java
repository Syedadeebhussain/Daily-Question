// Last updated: 8/8/2026, 11:03:42 pm
1class Solution {
2    public int orangesRotting(int[][] grid) {
3    int n=grid.length;
4    int m=grid[0].length;
5    Queue<int[]>q=new LinkedList<>();
6    int[][] dir={{-1,0},{1,0},{0,-1},{0,1}};
7    int fresh=0;
8    for(int i=0;i<n;i++){
9        for(int j=0;j<m;j++){
10            if(grid[i][j]==2){
11                q.add(new int[]{i,j});
12            }
13            else if(grid[i][j]==1){
14                fresh++;
15            }
16        }
17    }
18    int time=0;
19    while(!q.isEmpty() && fresh>0){
20        int size=q.size();
21        time++;
22        for(int i=0;i<size;i++){
23           int [] rm=q.poll();
24           int x=rm[0];
25           int y=rm[1];
26           for(int [] d:dir){
27            int nx=x+d[0];
28            int ny=y+d[1];
29            if(nx>=0 && nx<n && ny>=0 && ny<m && grid[nx][ny]==1){
30                 grid[nx][ny]=2;
31                 q.add(new int[]{nx,ny});
32                 fresh--;
33            }
34           }
35        }
36    }
37    return fresh==0?time:-1;
38    }
39}