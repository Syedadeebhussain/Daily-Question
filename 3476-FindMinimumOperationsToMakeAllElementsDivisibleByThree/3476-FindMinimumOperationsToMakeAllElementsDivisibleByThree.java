// Last updated: 31/7/2025, 2:21:42 pm
class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]-1)%3==0|| (nums[i]+1)%3==0){
                c++;
            }
        }
        return c;
    }
}