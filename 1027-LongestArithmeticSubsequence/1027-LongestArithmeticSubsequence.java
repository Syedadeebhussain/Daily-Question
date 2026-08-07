// Last updated: 7/8/2026, 11:48:31 am
1class Solution {
2    public int longestArithSeqLength(int[] nums) {
3    int [][] dp=new int[nums.length][1001];
4    int ans=2;
5    for(int i=1;i<nums.length;i++){
6       for(int j=0;j<i;j++){
7        int diff=nums[i]-nums[j]+500;
8        if(dp[j][diff]==0){
9            dp[i][diff]=2;
10        }
11        else{
12           dp[i][diff]=Math.max(dp[i][diff],dp[j][diff]+1);
13        }
14        ans=Math.max(ans, dp[i][diff]);
15       }
16    }
17    return ans;
18    }
19
20}