// Last updated: 14/2/2026, 8:57:15 pm
1class Solution {
2    long [] dp;
3    public long rob(int[] nums, int[] colors) {
4         dp=new long[nums.length];
5        Arrays.fill(dp,-1);
6        return Solve(nums,colors,0);
7    }
8    public long Solve(int [] nums,int[] color,int i){
9        if(i>=nums.length){
10            return 0;
11        }
12        if(dp[i]!=-1){
13            return dp[i];
14        }
15        long rob;
16        if(i<nums.length-1 && color[i]==color[i+1]){
17           rob=nums[i]+Solve(nums,color,i+2);
18        }
19        else{
20            rob=nums[i]+Solve(nums,color,i+1);
21        }
22        long no_rob=Solve(nums,color,i+1);
23        return dp[i]=Math.max(no_rob,rob);
24    }
25}