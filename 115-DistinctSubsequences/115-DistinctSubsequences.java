// Last updated: 6/9/2026, 10:30:41 pm
1class Solution {
2    int [][] dp;
3    public int numDistinct(String s, String t) {
4        dp=new int[s.length()][t.length()];
5        for(int [] a:dp){
6            Arrays.fill(a,-1);
7        }
8        return Solve(s,t,0,0);
9    }
10    public int Solve(String s,String t,int i,int j){
11        if(j==t.length()){
12            return 1;
13        }
14        if(i==s.length()){
15            return 0;
16        }
17        if(dp[i][j]!=-1){
18            return dp[i][j];
19        }
20        if(s.charAt(i)==t.charAt(j)){
21            int take=Solve(s,t,i+1,j+1);
22            int not_take=Solve(s,t,i+1,j);
23            dp[i][j]=take+not_take;
24        }
25        else{
26            dp[i][j]=Solve(s,t,i+1,j);
27        }
28        return dp[i][j];
29    }
30}