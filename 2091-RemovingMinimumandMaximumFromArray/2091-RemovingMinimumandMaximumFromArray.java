// Last updated: 30/8/2026, 6:35:23 pm
1class Solution {
2    public int minimumDeletions(int[] nums) {
3        int n = nums.length;
4        int minIndex = 0;
5        int maxIndex = 0;
6        for (int i = 1; i < n; i++) {
7            if (nums[i]<nums[minIndex])
8                minIndex=i;
9            if (nums[i]>nums[maxIndex])
10                maxIndex=i;
11        }
12        int first=Math.min(minIndex, maxIndex);
13        int second=Math.max(minIndex, maxIndex);
14        int left = second + 1;
15        int right = n-first;
16        int both = first+ 1 + n - second;
17        return Math.min(left, Math.min(right, both));
18    }
19}