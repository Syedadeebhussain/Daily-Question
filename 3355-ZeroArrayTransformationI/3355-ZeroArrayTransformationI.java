// Last updated: 8/1/2026, 11:36:51 pm
1class Solution {
2    public boolean isZeroArray(int[] nums, int[][] queries) {
3        int n = nums.length;
4        int[] diff = new int[n + 1];
5        for (int[] q : queries) {
6            int l = q[0];
7            int r = q[1];
8            diff[l] -= 1;
9            if (r + 1 < n) diff[r + 1] += 1;
10        }
11        int curr = 0; // How many times index i is subtracted (negative)
12        for (int i = 0; i < n; i++) {
13            curr += diff[i];
14            if (-curr < nums[i]) return false;
15        }
16        return true;
17        // we have to reduced number to 0 or less then 0
18    }
19}
20