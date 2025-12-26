// Last updated: 26/12/2025, 6:52:22 pm
1class Solution {
2    public int minAbsoluteDifference(List<Integer> nums, int x) {
3        if (x == 0) return 0;
4        TreeSet<Integer> set = new TreeSet<>();
5        int ans = Integer.MAX_VALUE;
6        for (int i = x; i < nums.size(); i++) {
7            set.add(nums.get(i - x));
8            int val = nums.get(i);
9            Integer low = set.floor(val);
10            if (low != null) {
11                ans = Math.min(ans, Math.abs(val - low));
12            }
13            Integer high = set.ceiling(val);
14            if (high != null) {
15                ans = Math.min(ans, Math.abs(val - high));
16            }
17        }
18        return ans == Integer.MAX_VALUE ? -1 : ans;
19    }
20}
21