// Last updated: 31/7/2025, 2:27:47 pm
class Solution {
    public int search(int[] nums, int target) {
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]==target)
        {
            return i;
        }
    }
    return -1;
    }
}