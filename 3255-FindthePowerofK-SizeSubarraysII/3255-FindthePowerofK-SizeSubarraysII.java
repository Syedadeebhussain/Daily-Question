// Last updated: 28/12/2025, 9:37:51 pm
1class Solution {
2    public int[] resultsArray(int[] nums, int k) {
3          if (k == 1) return nums;
4        int n = nums.length;
5        int[] res = new int[n - k + 1];
6        int count = 1;  
7        for (int i = 1; i < n; i++) {
8            if (nums[i] == nums[i - 1] + 1) {
9                count++;
10            } else {
11                count = 1;
12            }
13            if (i >= k - 1) {
14                if (count >= k) {
15                    res[i - k + 1] = nums[i];
16                } else {
17                    res[i - k + 1] = -1;
18                }
19            }
20        }
21        return res;
22    }
23}
24