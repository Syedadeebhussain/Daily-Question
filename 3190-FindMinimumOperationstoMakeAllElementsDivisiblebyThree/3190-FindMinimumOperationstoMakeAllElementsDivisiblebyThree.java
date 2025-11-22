// Last updated: 22/11/2025, 11:24:21 pm
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