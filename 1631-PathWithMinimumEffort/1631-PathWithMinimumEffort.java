// Last updated: 2/1/2026, 3:27:50 pm
1class Solution {
2    public int minimumEffortPath(int[][] heights) {
3
4        // max ko min karna hai
5        int m=heights.length;
6        int n=heights[0].length;
7        int [] [] dist=new int [m][n];
8        for(int [] arr:dist){
9            Arrays.fill(arr,Integer.MAX_VALUE);
10        }
11         int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};
12        dist[0][0]=0;
13        PriorityQueue<int []>pq=new PriorityQueue<>((a,b)->a[2]-b[2]);
14        pq.add(new int []{0,0,0});
15        while(!pq.isEmpty()){
16              int [] rm=pq.poll();
17              int x=rm[0];
18              int y=rm[1];
19              int dis=rm[2];
20              if(x==m-1 && y==n-1) return dis;
21              for(int [] d:dirs){
22                int nx=x+d[0];
23                int ny=y+d[1];
24                if(nx>=0 && nx<m && ny>=0 && ny<n ){
25                    int newcost=Math.max(dis,Math.abs(heights[x][y]-heights[nx][ny]));
26                    if(newcost<dist[nx][ny]){
27                        dist[nx][ny]=newcost;
28                        pq.add(new int []{nx,ny,newcost});
29                    }
30                }
31              }
32        }
33        return -1;
34    }
35}