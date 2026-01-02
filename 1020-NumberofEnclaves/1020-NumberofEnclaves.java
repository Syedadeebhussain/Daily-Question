// Last updated: 2/1/2026, 2:47:53 pm
1class Solution {
2    public int numEnclaves(int[][] board) {
3     int m=board.length;
4        int n=board[0].length;
5      Queue<int[] > q=new LinkedList<>();
6      boolean [][] safe=new boolean [board.length][board[0].length];
7      for(int i=0;i<board.length;i++){
8        for(int j=0;j<board[0].length;j++){
9            if(i==0 || j==0 || i==board.length-1 || j==board[0].length-1){
10                if(board[i][j]==1){
11                    q.add(new int []{i,j});
12                    safe[i][j]=true;
13                }
14            }
15        }
16      }
17        int[][] dirs = {{1, 0},{-1, 0},{0, 1},{0, -1}};
18        while(!q.isEmpty()){
19            int [] rm=q.poll();
20            int x=rm[0];
21            int y=rm[1];
22            for(int [] dir:dirs){
23                int nx=x+dir[0];
24                int ny=y+dir[1];
25                if(nx>=0 && nx<m && ny>=0 && ny<n && safe[nx][ny]==false && board[nx][ny]==1){
26                    safe[nx][ny]=true;
27                    q.add(new int []{nx,ny});
28                }
29            }
30        }
31        int c=0;
32        for(int i=0;i<m;i++){
33            for(int j=0;j<n;j++){
34                if(!safe[i][j] && board[i][j]==1){
35                    c++;
36                }
37            }
38        } 
39        return c;
40    }
41}
42