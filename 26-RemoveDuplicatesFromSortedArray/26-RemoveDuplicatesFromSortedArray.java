// Last updated: 31/7/2025, 2:27:52 pm
class Solution {
    public int removeDuplicates(int[] nums) {
    int j=0;
      for(int i=0;i<nums.length;i++){
        if(j<1 ||nums[i]!=nums[j-1]){
            nums[j]=nums[i];
            j++;
        }

      } 
      return j; 
    
    }
}