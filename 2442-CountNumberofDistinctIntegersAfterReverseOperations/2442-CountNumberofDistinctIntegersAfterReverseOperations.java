// Last updated: 31/7/2025, 9:50:57 pm
class Solution {
    public int countDistinctIntegers(int[] nums) {
         Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);              // Add original number
            set.add(reverse(num));    // Add reversed number
        }

        return set.size();
    }

    private int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return rev;
    }
}