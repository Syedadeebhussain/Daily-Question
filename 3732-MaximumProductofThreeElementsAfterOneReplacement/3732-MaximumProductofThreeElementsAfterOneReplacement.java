// Last updated: 3/11/2025, 8:36:57 pm
class Solution {
    public long maxProduct(int[] nums) {
        if (nums.length < 2) return 0;
        long first = 0;
        long second = 0;
        for (int num : nums) {
            long val = Math.abs(num);
            if (val > first) {
                second = first;
                first = val;
            } else if (val > second) {
                second = val;
            }
        }
        return first * second *100000;
    }
}
