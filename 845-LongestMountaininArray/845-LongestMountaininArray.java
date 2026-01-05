// Last updated: 5/1/2026, 3:59:25 pm
1class Solution {
2    public int longestMountain(int[] nums) {
3    int n=nums.length ;
4        if (n< 3) return 0;
5        int [] lis=LIS(nums);
6        int [] lds=LDS(nums);
7        int ans =0;
8        for(int i=0;i<n;i++){
9            if(lis[i]>0 && lds[i]>0)
10            {
11            ans=Math.max(ans,lis[i]+lds[i]+1);
12            }
13        }
14        return ans;
15    }
16    public int [] LIS(int [] arr){
17       int n=arr.length;
18       int [] left=new int[n];
19       for(int i=1;i<n;i++){
20        if(arr[i]>arr[i-1]){
21            left[i]=left[i-1]+1; // iske left me kitne smaller element hai continuous
22        }
23       }
24       return left;
25    }
26    public int[] LDS(int [] arr){
27         int n=arr.length;
28       int [] right=new int[n];
29       for(int i=n-2;i>=0;i--){
30        if(arr[i]>arr[i+1]){
31            right[i]=right[i+1]+1;  // iske right me kitne bigger element hai continuous
32        }
33       }
34       return right;
35    }
36}