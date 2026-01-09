// Last updated: 9/1/2026, 10:24:37 pm
1class Solution {
2    public boolean[] subsequenceSumAfterCapping(int[] nums, int k) {
3        int len = nums.length;
4        boolean[] result = new boolean[len];
5        Arrays.sort(nums);
6        boolean[] possibleSum = new boolean[k + 1];
7        possibleSum[0] = true;
8        int ptr = 0; 
9        for (int cap = 1; cap <= len; cap++) {
10            while (ptr < len && nums[ptr] < cap) {
11                int val = nums[ptr];
12                for (int sum = k; sum >= val; sum--) {
13                    if (possibleSum[sum - val]) {
14                        possibleSum[sum] = true;
15                    }
16                }
17                ptr++;
18            }
19            int remaining = len - ptr;
20            for (int take = 0; take <= remaining; take++) {
21                int cappedSum = take * cap;
22                if (cappedSum > k) break;
23                if (possibleSum[k - cappedSum]) {
24                    result[cap - 1] = true;
25                    break;
26                }
27            }
28        }
29        return result;
30    }
31}
32