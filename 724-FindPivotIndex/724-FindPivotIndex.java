// Last updated: 8/8/2025, 6:21:41 pm
class Solution {
    public int pivotIndex(int[] nums) {
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            arr[i] = nums[i] + arr[i - 1];
        }
        for (int j = 0; j < nums.length; j++) {
            int leftSum = (j == 0) ? 0 : arr[j - 1];
            int rightSum = arr[nums.length - 1] - arr[j];
            if (leftSum == rightSum) {
                return j;
            }
        }
        return -1;
    }
}