// Last updated: 19/12/2025, 9:41:41 am
1class Solution {
2    public int absDifference(int[] nums, int k) {
3    Arrays.sort(nums);
4    int s1=0;
5    int s2=0;
6    for(int i=0;i<k;i++){
7         s1+=nums[i];
8         s2+=nums[nums.length-i-1];
9    } 
10    return Math.abs(s1-s2);
11    }
12}