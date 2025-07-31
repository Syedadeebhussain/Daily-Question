// Last updated: 31/7/2025, 2:24:30 pm
class Solution {
    public int[] runningSum(int[] nums) {
        int [] arr=new int[nums.length];
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            arr[i]=arr[i-1]+nums[i];
        }
        return arr;
    }
}