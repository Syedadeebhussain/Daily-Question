// Last updated: 23/1/2026, 10:11:02 pm
1class Solution {
2    public long countNonDecreasingSubarrays(int[] nums, int k) {
3        Deque<int[]> window = new ArrayDeque<>();
4        int left = nums.length - 1;
5        int right = nums.length - 1;
6        long cost = 0;
7        long result = 0;
8        while (left >= 0) {
9            int freq = 0;
10            while (!window.isEmpty() && window.peekFirst()[0] <= nums[left]) {
11                int[] block = window.pollFirst();
12                freq += block[1];
13                cost += (long) block[1] * (nums[left] - block[0]);
14            }
15            window.offerFirst(new int[]{nums[left], freq + 1});
16            while (left < right && cost > k) {
17                int[] tail = window.pollLast();
18                cost -= (long) (tail[0] - nums[right]);
19                tail[1]--;
20                if (tail[1] > 0) {
21                    window.offerLast(tail);
22                }
23                right--;
24            }
25            if (cost <= k) {
26                result += (right - left + 1);
27            }
28            left--;
29        }
30        return result;
31    }
32}
33