// Last updated: 31/7/2025, 2:27:38 pm
class Solution {
    public int trap(int[] height) {
        return sol(height);
    }
    public static int sol(int[] arr)
    {
        int n=arr.length;
        int[] left=new int[n];
        int[] right=new int[n];
        left[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            left[i]=Math.max(left[i-1],arr[i]);
        }
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right[i]=Math.max(right[i+1],arr[i]);
        }
        int s=0;
          for(int i=1;i<n;i++)
        {
            s+=Math.min(left[i],right[i])-arr[i];
        }
        return s;
    }
}