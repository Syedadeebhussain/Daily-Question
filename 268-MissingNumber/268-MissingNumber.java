// Last updated: 31/7/2025, 2:26:07 pm
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=j){
                return j;
            }
            j++;
        }
        return j;
    }
}