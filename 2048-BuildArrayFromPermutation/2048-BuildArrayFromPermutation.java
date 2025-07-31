// Last updated: 31/7/2025, 2:23:42 pm
class Solution {
    public int[] buildArray(int[] nums) {
    int [] ans=new int [nums.length];
    for(int i=0;i<nums.length;i++){
        ans[i]=nums[nums[i]];
    }  
    return ans;
    }
}