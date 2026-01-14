// Last updated: 14/1/2026, 11:49:13 pm
1class Solution {
2    public long perfectPairs(int[] nums) {
3        int n = nums.length;
4        long[] arr = new long[n];
5        for (int i = 0; i < n; i++) {
6            arr[i] = Math.abs((long) nums[i]);
7        }
8        Arrays.sort(arr);
9        long ans = 0;
10        int j = 0;
11        for (int i = 0; i < n; i++) {
12            while (j < n && arr[j] <= 2 * arr[i]) {
13                j++;
14            }
15            ans += (j - i - 1);
16        }
17
18        return ans;
19    }
20}
21