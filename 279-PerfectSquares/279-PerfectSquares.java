// Last updated: 3/1/2026, 12:00:29 pm
1class Solution {
2    public int numSquares(int n) {
3        int []dp=new int[n+1];
4        Arrays.fill(dp,-1);
5        return Solve(n,dp);
6    }
7    public int Solve(int n,int [] dp){
8     if(n==0) return 0;
9     if(dp[n]!=-1){
10        return dp[n];
11     }
12     int ans=Integer.MAX_VALUE;
13     for(int i=1;i*i<=n;i++){
14        int sq=i*i;
15        ans=Math.min(ans,1+Solve(n-sq,dp));
16     }
17     return dp[n]=ans;
18    }
19}