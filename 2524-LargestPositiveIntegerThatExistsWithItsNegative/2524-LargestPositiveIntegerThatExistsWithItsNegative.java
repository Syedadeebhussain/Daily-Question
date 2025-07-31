// Last updated: 31/7/2025, 2:22:45 pm
class Solution {
    public int findMaxK(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==-nums[j]){
                    max=Math.max(nums[i],max);
                }
            }
           
        } 
        if(max>0){
            return max;
        } 
        return -1;
    }
}