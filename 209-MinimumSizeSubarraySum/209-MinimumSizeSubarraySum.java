// Last updated: 31/7/2025, 2:26:24 pm
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    int si=0;
    int ei=0;
    int ans=Integer.MAX_VALUE;
    int sum=0;
    while(ei<nums.length){
       sum+=nums[ei];//grow
        while(sum>=target){
        ans=Math.min(ans,ei-si+1);
        sum-=nums[si];
        si++;
       }
   
    ei++;
    } 
   return ans != Integer.MAX_VALUE ? ans : 0; 
    }
}