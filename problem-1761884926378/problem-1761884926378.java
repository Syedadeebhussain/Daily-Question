// Last updated: 31/10/2025, 9:58:46 am
class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int index = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }  
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=max && max<2*nums[i]){
            return -1;
        }
       }
       return index;
    }
}