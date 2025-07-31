// Last updated: 31/7/2025, 2:28:07 pm
class Solution {
    public int[] twoSum(int[] nums, int target) {
        return calc(nums,target);
    }
    public static int[] calc(int [] arr,int target)
{
	int n=arr.length;
	int[] result=new int[2];
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(arr[i]+arr[j]==target)
			{
				return new int[] {i,j};
			}
		}
	}
return new int[] {};
}
}