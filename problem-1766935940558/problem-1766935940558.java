// Last updated: 28/12/2025, 9:02:20 pm
1class Solution {
2    public int minimumSubarrayLength(int[] nums, int k) {
3        int min=Integer.MAX_VALUE;
4     for(int i=0;i<nums.length;i++){
5        for(int j=i;j<nums.length;j++){
6            int ans=0;
7            for(int k1=i;k1<=j;k1++){
8                ans|=nums[k1];
9            }
10            if(ans>=k){
11                min=Math.min(min,j-i+1);
12            }
13        }
14     }   
15     return min==Integer.MAX_VALUE?-1:min;
16    }
17}