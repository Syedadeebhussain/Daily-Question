// Last updated: 14/8/2026, 5:29:38 pm
1class Solution {
2    public int numOfSubarrays(int[] arr, int k, int threshold) {
3        int sum=0;
4        int c=0;
5        for(int i=0;i<k;i++){
6            sum+=arr[i];
7        }
8        if(sum/k>=threshold) c++;
9        for(int i=k;i<arr.length;i++){
10            sum+=arr[i];
11            sum-=arr[i-k];
12            if(sum/k>=threshold) c++;
13        }
14        return c;
15    }
16}