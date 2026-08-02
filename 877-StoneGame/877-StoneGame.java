// Last updated: 2/8/2026, 11:36:08 am
1class Solution {
2    int [][] dp;
3    public boolean stoneGame(int[] piles) {
4        dp=new int [piles.length][piles.length];
5        for(int [] a:dp){
6            Arrays.fill(a,-1);
7        }
8        int diff=Solve(piles,0,piles.length-1);
9        return diff >0;
10    }
11    public int Solve(int [] piles,int i,int j){
12        if(i==j){
13            return piles[i];
14        }
15        if(dp[i][j]!=-1) return dp[i][j];
16        int first=piles[i]-Solve(piles,i+1,j);//bob ne to le liya
17        int last=piles[j]-Solve(piles,i,j-1);
18        return dp[i][j]=Math.max(first,last);
19    }
20}
21// We compute the maximum possible score difference the current player can force over the opponent for every subarray, and if the final difference is positive, Alice wins.