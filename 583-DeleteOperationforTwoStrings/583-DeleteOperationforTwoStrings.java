// Last updated: 20/12/2025, 9:47:04 pm
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int n=word1.length();
4        int m=word2.length();
5       int [][] dp=new int [n+1][m+1];
6       for(int i=1;i<=n;i++){
7        for(int j=1;j<=m;j++){
8            if(word1.charAt(i-1)==word2.charAt(j-1)){
9                dp[i][j]=1+dp[i-1][j-1];
10            }
11            else{
12                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
13            }
14        }
15       } 
16       int l=dp[n][m];
17       int rword1=n-l;
18       int rword2=m-l;
19       return rword1+rword2;
20    }
21}