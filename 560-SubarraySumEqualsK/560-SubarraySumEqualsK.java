// Last updated: 31/1/2026, 12:09:58 pm
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        HashMap<Integer, Integer> freq = new HashMap<>();
4        freq.put(0, 1);
5        int sum = 0;
6        int c = 0;
7        for (int i = 0; i < nums.length; i++) {
8            sum += nums[i];
9            c += freq.getOrDefault(sum - k, 0);
10            freq.put(sum, freq.getOrDefault(sum, 0) + 1);
11        }
12        return c;
13    }
14}
15