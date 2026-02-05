// Last updated: 5/2/2026, 9:06:20 pm
1class Solution {
2    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
3        int n = nums.length;
4        int[] freq = new int[101];
5        int[] res = new int[n - k + 1];
6        for (int i = 0; i < k; i++) {
7            freq[nums[i] + 50]++;
8        }
9        res[0] = findBeauty(freq, x);
10        for (int i = k; i < n; i++) {
11            freq[nums[i] + 50]++;
12            freq[nums[i - k] + 50]--;
13            res[i - k + 1] = findBeauty(freq, x);
14        }
15        return res;
16    }
17    private int findBeauty(int[] freq, int x) {
18        int count = 0;
19        for (int i = 0; i < 50; i++) {
20            count += freq[i];
21            if (count >= x) {
22                return i - 50;
23            }
24        }
25        return 0;
26    }
27}
28