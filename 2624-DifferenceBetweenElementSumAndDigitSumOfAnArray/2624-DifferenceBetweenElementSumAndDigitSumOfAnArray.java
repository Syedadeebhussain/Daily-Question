// Last updated: 31/7/2025, 2:22:38 pm
class Solution {
    public int differenceOfSum(int[] nums) {
    int s1=sum1(nums);
    int s2=sum2(nums);
    return Math.abs(s1-s2);
    }
    public static int sum1(int[] nums)
    {
    int sum =0;
    for(int i=0;i<nums.length;i++)
    {
       sum+=nums[i];
    }
    return sum;
    }
    public static int sum2(int[] nums)
    {
    int sum =0;
    for(int i=0;i<nums.length;i++)
    {
       int n=nums[i];
       while(n!=0)
       {
        int r=n%10;
        sum+=r;
        n=n/10;
       }
    }
    return sum;
    } 
}