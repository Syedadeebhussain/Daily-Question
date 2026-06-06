// Last updated: 7/6/2026, 12:09:47 am
1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3     int[] left=new int[nums.length];
4     int[] right=new int[nums.length];
5     left[0]=0;
6     right[nums.length-1]=0;
7     for(int i=1;i<nums.length;i++)
8     {
9        left[i]=left[i-1]+nums[i-1];
10     }  
11     for(int j=nums.length-2;j>=0;j--)
12     {
13        right[j]=right[j+1]+nums[j+1];
14     }  
15        for(int k=0;k<nums.length;k++)
16     {
17        nums[k]=Math.abs(left[k]-right[k]);
18     }  
19     return nums;
20    }
21}