// Last updated: 31/7/2025, 2:26:31 pm
class Solution {
    public void rotate(int[] nums, int k) {
       Rotate(nums,k);
    }
    public static void Rotate(int [] arr,int k)
		{
			int n=arr.length;
			k=k%n;
			//starting n-k Reverse kro
			Reverse(arr,0,n-k-1);
			
			//starting ke k Reverse kro
			Reverse(arr,n-k,n-1);
			
			//all element Reverse kro
			Reverse(arr,0,n-1);
			
		}
		public static void Reverse(int [] arr,int i,int j)
		{
			while(i<j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
			
		}

}