// Last updated: 6/3/2026, 11:03:53 pm
1class Solution {
2    public void rotate(int[] nums, int k) {
3       Rotate(nums,k);
4    }
5    public static void Rotate(int [] arr,int k)
6		{
7            k=k%arr.length;
8            //reverse entire array
9            Reverse(arr,0,arr.length-1);
10            //reverse starting k elements
11            Reverse(arr,0,k-1);
12            //reverse remaining elements
13             Reverse(arr,k,arr.length-1);
14		}
15		public static void Reverse(int [] arr,int i,int j)
16		{
17			while(i<j)
18			{
19				int temp=arr[i];
20				arr[i]=arr[j];
21				arr[j]=temp;
22				i++;
23				j--;
24			}
25			
26		}
27
28}