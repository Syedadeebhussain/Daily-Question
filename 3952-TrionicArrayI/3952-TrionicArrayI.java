// Last updated: 5/8/2025, 2:58:06 pm
class Solution {
    public boolean isTrionic(int[] nums) {
    for(int i=1;i<nums.length-2;i++){
        for(int j=i+1;j<nums.length-1;j++){
    if(isIncreasing(0,i,nums) && isDecreasing(i,j,nums) && isIncreasing(j,nums.length-1,nums)){
                    return true;
                }
        }
    }    
        return false;
    }
    public boolean isIncreasing(int i,int j,int [] nums){
       
        for(int a=i;a<j;a++){
            if(nums[a]>=nums[a+1]){
                return false;
            }
        }
        return true;
    }
    public boolean isDecreasing(int i,int j,int [] nums){
     
        for(int a=i;a<j;a++){
            if(nums[a]<=nums[a+1]){
                return false;
            }
        }
        return true;
    }
    
}