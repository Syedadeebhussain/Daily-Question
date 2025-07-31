// Last updated: 31/7/2025, 2:25:15 pm
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
    int lo=0;
    int hi=arr.length-1;
    int ans=0;
    while(lo<=hi)
    {
        int mid=(lo+hi)/2;
        if(arr[mid+1]>arr[mid])
        {
            lo=mid+1;
        }
        else
        {
            hi=mid-1;
        }
    }
    return lo;
    }
}