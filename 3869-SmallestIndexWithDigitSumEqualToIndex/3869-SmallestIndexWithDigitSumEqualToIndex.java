// Last updated: 31/7/2025, 2:21:20 pm
class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (sum(nums[i]) == i) {
                return i;
            }
        }
        return -1;
    }

    public int sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}
