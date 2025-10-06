// Last updated: 6/10/2025, 10:43:22 am
class Solution {
    public int minPairSum(int[] nums) {
       int max=Integer.MIN_VALUE;
       Arrays.sort(nums);
       int i=0;
       int j=nums.length-1;
       while(i<j){
         int sum=nums[i]+nums[j];
         max=Math.max(sum,max);
         i++;
         j--;
       }
       return max;
    }
}