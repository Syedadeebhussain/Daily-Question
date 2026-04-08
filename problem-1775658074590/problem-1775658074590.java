// Last updated: 8/4/2026, 7:51:14 pm
1class Solution {
2    public int xorAfterQueries(int[] nums, int[][] queries) {
3       for(int []arr :queries){
4           int a=arr[0];
5           int b=arr[1];
6           int c=arr[2];
7           int d=arr[3];
8           for(int i=a;i<=b;i=i+c){
9               long ans=(1L*nums[i]*d)%(int)(Math.pow(10,9)+7);
10               nums[i]=(int)ans;
11           }
12       } 
13        int ans1=0;
14        for(int num:nums){
15            ans1^=num;
16        }
17        return ans1;
18    }
19}