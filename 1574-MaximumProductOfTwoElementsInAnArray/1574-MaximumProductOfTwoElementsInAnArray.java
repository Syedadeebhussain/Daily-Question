// Last updated: 31/7/2025, 2:24:31 pm
class Solution {
    public int maxProduct(int[] nums) {
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //    if(((nums[i]-1)*(nums[j]-1))>=max) 
        //    {
        //     max=(nums[i]-1)*(nums[j]-1);
        //    }
        //     }
            
            
        // }
        // return max;
        // Arrays.sort(nums);
        // int num1=nums[nums.length-1]-1;
        // int num2=nums[nums.length-2]-1;
        // return num1*num2;


        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
for(int i=0;i<nums.length;i++)
{
    if(max1<=nums[i])
    {
        max2=max1;
        max1=nums[i];
    }
    else if(max2<=nums[i])
    {
        max2=nums[i];
    }
    
}
return (max1-1)*(max2-1);
    }
}