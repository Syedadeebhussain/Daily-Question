// Last updated: 31/7/2025, 2:27:21 pm
class Solution {
    public void sortColors(int[] nums) {
        sort(nums);
    }
    public static void sort(int[] arr)
    {
      for(int i=1;i<arr.length;i++)
      {
        insertelement(arr,i);
      }
    }
    public static void insertelement(int [] arr,int i)
    {
        int temp=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>temp)
        {
            arr[j+1]=arr[j];
            arr[j]=temp;
            j--;
        }
    }
}