// Last updated: 5/10/2025, 8:26:17 am
class Solution {
    public int alternatingSum(int[] nums) {
      int sum=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                sum+=nums[i];
            }
            else{
                sum-=nums[i];
            }
        }
        return sum;
    }
}