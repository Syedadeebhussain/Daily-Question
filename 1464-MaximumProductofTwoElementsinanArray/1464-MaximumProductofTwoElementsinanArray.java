// Last updated: 27/7/2026, 11:50:27 pm
1class Solution {
2    public int maxProduct(int[] nums) {
3
4        int max1=Integer.MIN_VALUE;
5        int max2=Integer.MIN_VALUE;
6for(int i=0;i<nums.length;i++)
7{
8    if(max1<=nums[i])
9    {
10        max2=max1;
11        max1=nums[i];
12    }
13    else if(max2<=nums[i])
14    {
15        max2=nums[i];
16    }
17    
18}
19return (max1-1)*(max2-1);
20    }
21}