// Last updated: 31/7/2025, 2:25:05 pm
class Solution {
    public int[] sortedSquares(int[] nums) {
         for(int i3=0;i3<nums.length;i3++)
        {
           nums[i3]=nums[i3]*nums[i3];
        }
          Arrays.sort(nums);
          return nums;
    }
}