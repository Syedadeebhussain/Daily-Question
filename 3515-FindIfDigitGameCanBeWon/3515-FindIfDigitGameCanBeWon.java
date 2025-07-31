// Last updated: 31/7/2025, 2:21:41 pm
class Solution {
    public boolean canAliceWin(int[] nums) {
      int se=0,so=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]<10){
            se+=nums[i];
        }
        else{
            so+=nums[i];
        }
      }  
      if(se!=so){
        return true;
      }
      return false;
    }
}