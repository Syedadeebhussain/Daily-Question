// Last updated: 31/7/2025, 2:21:29 pm
class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        for (int count : freq) {
            if (count > 0) {
                if (count % 2 == 0) {
                    minEven = Math.min(minEven, count);
                } else {
                    maxOdd = Math.max(maxOdd, count);
                }
            }
        }

        return maxOdd - minEven;
    }
}