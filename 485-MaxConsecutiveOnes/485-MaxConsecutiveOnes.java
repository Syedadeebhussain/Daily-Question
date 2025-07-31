// Last updated: 31/7/2025, 2:25:43 pm
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=Integer.MIN_VALUE;;
        int c=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            c++;
        }
        else
        {
            ans=Math.max(ans,c);
            c=0;
        }
      }  
        ans=Math.max(ans,c);
      return ans;
    }
}