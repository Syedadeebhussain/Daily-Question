// Last updated: 7/2/2026, 10:44:16 pm
1class Solution {
2    public long minimalKSum(int[] nums, int k) {
3        Arrays.sort(nums);
4        long sum = 0;
5        long curr = 1;
6        for (int n : nums) {
7            if (n < curr) continue;
8            long gap = n - curr;
9            if (gap >= k) {
10                long last = curr + k - 1;
11                sum += (curr + last) * k / 2;
12                return sum;
13            }
14            long last = n - 1;
15            sum += (curr + last) * gap / 2;
16            k -= gap;
17            curr = n + 1;
18        }
19        long last = curr + k - 1;
20        sum += (curr + last) * k / 2;
21        return sum;
22    }
23}
24