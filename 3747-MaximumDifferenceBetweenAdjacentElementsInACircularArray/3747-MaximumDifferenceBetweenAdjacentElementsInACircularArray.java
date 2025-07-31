// Last updated: 31/7/2025, 2:21:31 pm
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            int val=Math.abs(nums[i+1]-nums[i]);
            if(val>=max){
                max=val;
            }
        }
        int val1=Math.abs(nums[nums.length-1]-nums[0]);
        if(val1>max){
            max=val1;
        }
        return max;
    }
}