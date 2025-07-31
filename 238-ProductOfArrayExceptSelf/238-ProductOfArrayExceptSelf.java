// Last updated: 31/7/2025, 2:26:13 pm
class Solution {
    public int[] productExceptSelf(int[] nums) {
        return Product(nums);
    }
    public static int[] Product(int [] arr)
	{
		int n=arr.length;
		int [] left=new int [n];
		int [] right=new int [n];
		left[0]=1;
		for(int i=1;i<n;i++)
		{
		 left[i]=left[i-1]*arr[i-1];
		}
		right[n-1]=1;
		for(int j=n-2;j>=0;j--)
		{
			right[j]=right[j+1]*arr[j+1];
		}
		for(int k=0;k<n;k++)
		{
		arr[k]=left[k]*right[k];
		}
		return arr;
	}
}