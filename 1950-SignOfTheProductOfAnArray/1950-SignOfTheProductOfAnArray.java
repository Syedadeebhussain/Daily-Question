// Last updated: 31/7/2025, 2:23:54 pm
class Solution {
    public int arraySign(int[] nums) {
        return signFunc(nums);
    }
    public static int signFunc(int[] nums)
    {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
        if(nums[i]==0)
        {
            return 0;
        }
        else if(nums[i]<0)
        {
            c++;
        }
        }
       if(c%2==0)
       {
        return 1;
       }
       else
       {
        return -1;
       }
    }
    }