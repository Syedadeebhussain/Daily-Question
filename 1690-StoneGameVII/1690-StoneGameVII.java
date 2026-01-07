// Last updated: 7/1/2026, 5:40:13 pm
1class Solution {
2    int [] prefix;
3    int [][] dp;
4    public int stoneGameVII(int[] stones) {
5        prefix=new int [stones.length];
6        dp=new int[stones.length][stones.length];
7        for(int []a:dp)
8        {
9        Arrays.fill(a,-1);
10        }
11        prefix=new int[stones.length+1];
12        prefix[0]=0;
13        for(int i=1;i<prefix.length;i++){
14            prefix[i]=prefix[i-1]+stones[i-1];
15        }
16        return Solve(stones,0,stones.length-1);
17    }
18    public int Solve(int [] stones,int i,int j){
19        if(i==j){
20            return 0;
21        }
22        if(dp[i][j]!=-1) return dp[i][j];
23        int lsum=prefix[j+1]-prefix[i+1];
24        int lpick=lsum-Solve(stones,i+1,j);
25        int rsum=prefix[j]-prefix[i];
26        int rpick=rsum-Solve(stones,i,j-1);
27        return dp[i][j]=Math.max(lpick,rpick);
28    }
29
30}