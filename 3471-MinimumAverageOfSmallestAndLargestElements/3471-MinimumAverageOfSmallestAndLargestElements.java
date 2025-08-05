// Last updated: 5/8/2025, 2:58:39 pm
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
