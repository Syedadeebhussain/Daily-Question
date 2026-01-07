// Last updated: 7/1/2026, 6:33:54 pm
1class Solution {
2    int [] [] dp;
3    int [] prefix;
4    public int stoneGameV(int[] stoneValue) {
5         dp=new int [stoneValue.length][stoneValue.length];
6         prefix=new int[stoneValue.length+1];
7         prefix[0]=0;
8         for(int i=1;i<prefix.length;i++){
9            prefix[i]=prefix[i-1]+stoneValue[i-1];
10         }
11         for(int [] a:dp){
12            Arrays.fill(a,-1);
13         }
14    return Solve(stoneValue,0,stoneValue.length-1);
15    }
16    public int Solve(int [] arr,int i,int j){
17        if(i==j) return 0;
18        if(dp[i][j]!=-1) return dp[i][j];
19        int max=Integer.MIN_VALUE;
20        for(int k=i;k<=j-1;k++){
21           int lsum=prefix[k+1]-prefix[i];
22           int rsum=prefix[j+1]-prefix[k+1];
23           if(lsum<rsum){
24            max=Math.max(max,lsum+Solve(arr,i,k));
25           }
26           else if (lsum>rsum){
27           max=Math.max(max,rsum+Solve(arr,k+1,j));
28           }
29           else{
30            max=Math.max(max,rsum+Math.max(Solve(arr,k+1,j),Solve(arr,i,k)));
31           }
32        }
33        return dp[i][j]=max;
34    }
35
36
37    //this Q is somewhat similar to palindrome paritioning in applying calls
38}