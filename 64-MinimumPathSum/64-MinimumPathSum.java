// Last updated: 6/5/2026, 12:50:20 am
1class Solution {
2    int [][] dp;
3    public int minPathSum(int[][] grid) {
4        int n=grid.length;
5        int m=grid[0].length;
6        dp=new int[n][m];
7        for(int [] dp1:dp){
8        Arrays.fill(dp1,-1);
9        }
10        return Solve(grid,0,0);
11    }
12    public int Solve(int[][] grid,int r,int c){
13        if(r==grid.length-1 && c==grid[0].length-1){
14            return grid[r][c];
15        }
16        if(r>=grid.length || c>=grid[0].length){
17            return Integer.MAX_VALUE;
18        }
19        if(dp[r][c]!=-1) return dp[r][c];
20        int a=Solve(grid,r,c+1);
21        int b=Solve(grid,r+1,c);
22        dp[r][c]=Math.min(a,b)+grid[r][c];
23         return dp[r][c];
24    }
25}