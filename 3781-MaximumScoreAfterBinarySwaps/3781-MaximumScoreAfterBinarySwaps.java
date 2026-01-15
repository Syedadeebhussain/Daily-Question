// Last updated: 15/1/2026, 11:00:04 pm
1class Solution {
2    public long maximumScore(int[] nums, String s) {
3        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
4        long score = 0;
5        int n = nums.length;
6        for (int i = 0; i < n; i++) {
7            pq.offer((long) nums[i]);
8            if (s.charAt(i) == '1') {
9                score += pq.poll();
10            }
11        }
12        return score;
13    }
14}
15