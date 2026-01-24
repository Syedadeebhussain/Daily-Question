// Last updated: 24/1/2026, 10:38:41 pm
1class Solution {
2    int[][] dp ;
3    public int minimizeTheDifference(int[][] mat, int target) {
4        dp= new int[mat.length][5001];
5        for(int [] a:dp){
6            Arrays.fill(a,-1);
7        }
8        return Solve(mat, 0, target,0);
9    }
10    
11    public int Solve(int[][] mat,int row,int target, int val){
12        if(row == mat.length){
13            return Math.abs(val - target);
14        }
15        if(dp[row][val] != -1){
16            return dp[row][val];
17        }
18        int res = Integer.MAX_VALUE;
19        for(int i = 0; i < mat[0].length; i++){
20            res = Math.min(res, Solve(mat,row + 1, target, val + mat[row][i]));
21        }
22        return dp[row][val] = res;
23    }
24}