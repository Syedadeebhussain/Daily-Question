// Last updated: 31/7/2025, 2:21:40 pm
class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
       
        for (int op = 0; op < k; op++) {
            int minIndex = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[minIndex]) {
                    minIndex = i;
                }
            } 
            nums[minIndex] *= multiplier;
        }
        return nums;
    }
}
