// Last updated: 6/10/2025, 7:28:47 pm
class Solution {
    public boolean canPartition(int[] nums) {
     int sum=0;
     for(int i=0;i<nums.length;i++){
        sum+=nums[i];
     }  
     if(sum%2!=0){
        return false;
     } 
     int s=sum/2;
    Boolean [][] dp=new Boolean [nums.length+1][s+1];
     return solve(nums,0,s,dp);
    }
   public boolean solve(int [] nums,int i,int s,Boolean[][] dp){
    if(s==0){
        return true;
    }
    if(i>=nums.length){
        return false;
    }
    if(dp[i][s]!=null){
        return dp[i][s];
    }

    boolean a=solve(nums,i+1,s,dp);
     boolean b=false;
    if(nums[i]<=s){
       b= solve(nums,i+1,s-nums[i],dp);
    }
    return dp[i][s]=a||b;

   }
}