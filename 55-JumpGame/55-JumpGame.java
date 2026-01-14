// Last updated: 14/1/2026, 4:54:34 pm
1class Solution {
2    Boolean [] dp;
3    public boolean canJump(int[] nums) {
4        dp=new Boolean[nums.length];
5        return Solve(nums,0);
6    }
7    public boolean Solve(int [] nums,int i){
8        if(i>=nums.length) return false;
9        if(i==nums.length-1) return true;
10        if(dp[i]!=null){
11            return dp[i];
12        }
13        for(int x=1;x<=nums[i];x++){
14         if(Solve(nums,i+x)){
15            return dp[i]=true;
16         }
17        }
18        return dp[i]=false;
19    }
20}