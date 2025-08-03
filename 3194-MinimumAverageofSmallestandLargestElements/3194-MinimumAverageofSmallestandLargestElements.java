// Last updated: 3/8/2025, 8:42:24 am
class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double min = Double.MAX_VALUE;
        int left=0;
        int right=nums.length-1;
        while(left<=right) {
            double sum = (nums[left] + nums[right]) / 2.0;
            left++;
            right--;
            min=Math.min(min,sum);
        }
        return min;
    }
}
