// Last updated: 31/7/2025, 2:23:08 pm
class Solution {
    public boolean divideArray(int[] nums) {
      int [] freq=new int[600];
      for(int i=0;i<nums.length;i++){
          freq[nums[i]]++;
      }
      for(int i=0;i<nums.length;i++)
      {
      if(freq[nums[i]]%2==1){
        return false;
      }
      }
      return true;
    }
}