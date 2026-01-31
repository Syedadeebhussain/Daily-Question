// Last updated: 31/1/2026, 9:49:52 pm
1class Solution {
2    public int arrayPairSum(int[] nums) {
3     Arrays.sort(nums);
4     int sum=0;
5    for(int i=0;i<nums.length;i+=2){
6        sum+=Math.min(nums[i],nums[i+1]);
7    }  
8    return sum;
9    }
10}