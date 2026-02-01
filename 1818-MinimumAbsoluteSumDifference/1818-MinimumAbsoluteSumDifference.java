// Last updated: 1/2/2026, 9:37:07 pm
1class Solution {
2    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
3        int MOD = 1000000007;
4        int n = nums1.length;
5        int[] sorted = nums1.clone();
6        Arrays.sort(sorted);
7        long totalSum = 0;
8        int maxGain = 0;
9        for (int i = 0; i < n; i++) {
10            int currDiff = Math.abs(nums1[i] - nums2[i]);
11            totalSum += currDiff;
12            int idx = Arrays.binarySearch(sorted, nums2[i]);
13            if (idx < 0) idx = -idx - 1;
14            if (idx < n) {
15                maxGain = Math.max(maxGain, currDiff - Math.abs(sorted[idx] - nums2[i]));
16            }
17            if (idx > 0) {
18                maxGain = Math.max(maxGain, currDiff - Math.abs(sorted[idx - 1] - nums2[i]));
19            }
20        }
21        return (int)((totalSum - maxGain) % MOD);
22    }
23}
24