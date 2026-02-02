// Last updated: 2/2/2026, 8:36:15 pm
1class Solution {
2    public int[] maxSlidingWindow(int[] nums, int k) {
3        int n = nums.length;
4        int[] ans = new int[n - k + 1];
5        Deque<Integer> dq = new LinkedList<>();
6        int idx = 0;
7        for (int i = 0; i < n; i++) {
8            // Remove indices out of window
9            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
10                dq.pollFirst();
11            }
12            // Remove smaller elements from back
13            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
14                dq.pollLast();
15            }
16            dq.addLast(i);
17            if (i >= k - 1) {
18                ans[idx++] = nums[dq.peekFirst()];
19            }
20        }
21        return ans;
22    }
23}
24