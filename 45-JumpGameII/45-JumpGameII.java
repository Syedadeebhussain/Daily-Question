// Last updated: 15/1/2026, 12:31:01 am
1class Solution {
2    int [] dp;
3    public int jump(int[] nums) {
4      dp=new int[nums.length];
5      Arrays.fill(dp,-1);
6        return Solve(nums,0);
7    }
8    public int Solve(int [] nums,int i){
9        if(i>=nums.length) return Integer.MAX_VALUE-1;
10        if(i==nums.length-1) return 0;
11        if(dp[i]!=-1){
12            return dp[i];
13        }
14        int min=Integer.MAX_VALUE-1;
15        for(int x=1;x<=nums[i];x++){
16         min=Math.min(min,1+Solve(nums,i+x));
17        }
18        return dp[i]=min;
19    }
20}