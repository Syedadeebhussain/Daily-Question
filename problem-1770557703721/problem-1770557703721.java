// Last updated: 8/2/2026, 7:05:03 pm
1class Solution {
2    public int dominantIndices(int[] nums) {
3     int [] prefix=new int[nums.length+1];
4     prefix[0]=0;
5     for(int i=1;i<=nums.length;i++){
6          prefix[i]=prefix[i-1]+nums[i-1];
7     }   
8     int count=0;
9     for(int i=0;i<nums.length;i++){
10        int rem=prefix[nums.length]-prefix[i];
11        int c=nums.length-i;
12        if(nums[i]>(rem/c)){
13            count++;
14        }
15     }
16     return count;
17     
18    }
19}