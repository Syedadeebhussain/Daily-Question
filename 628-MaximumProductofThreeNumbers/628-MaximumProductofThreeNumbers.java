// Last updated: 27/9/2025, 1:16:46 pm
class Solution {
    public int maximumProduct(int[] nums) {
      Arrays.sort(nums);
      int ans=nums[0]*nums[1]*nums[nums.length-1];
        int p=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        ans=Math.max(ans,p);
        return ans;

    }
}