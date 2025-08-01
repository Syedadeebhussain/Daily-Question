// Last updated: 31/7/2025, 2:27:34 pm
class Solution {
    public int maxSubArray(int[] nums) {
        return max_sum(nums);
    }
    public static int max_sum(int[] arr)
	{
		int ans=Integer.MIN_VALUE;
		 int sum=0;
		for(int i=0;i<arr.length;i++)
		{	  
				sum+=arr[i];
				ans=Math.max(ans, sum);
				if(sum<0)
				{
					sum=0;
				}
		}
		return ans;
	}
}