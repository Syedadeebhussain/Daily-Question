// Last updated: 31/7/2025, 2:22:44 pm
class Solution {
    public int averageValue(int[] nums) {
        int c=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%6==0)
            {
             c+=nums[i];
             count++;
            }
        }
        return count == 0 ? 0 : c/count;
       
    }
}