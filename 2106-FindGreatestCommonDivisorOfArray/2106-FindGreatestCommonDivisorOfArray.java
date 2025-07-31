// Last updated: 31/7/2025, 2:23:35 pm
class Solution {
    public int findGCD(int[] nums) {
        int dividend=max(nums);
        int divisor=min(nums);
        while(dividend%divisor!=0){
            int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
        }
        return divisor;
    }
    public int max(int [] nums){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        return max;
    }
       public int min(int [] nums){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
        }
        return min;
    }
}