// Last updated: 31/7/2025, 2:24:39 pm
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
     int [] left=new int[nums.length];
     for(int i=0;i<nums.length;i++)
     {
        int c=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[i]>nums[j])
            {
                c++;
            }
        }
        left[i]=c;
     }
     return left;
    }
}