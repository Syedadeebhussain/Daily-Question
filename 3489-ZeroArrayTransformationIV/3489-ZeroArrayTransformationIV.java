// Last updated: 8/1/2026, 10:17:30 pm
1class Solution {
2
3    public int minZeroArray(int[] nums, int[][] queries) {
4        int n = nums.length;
5
6        boolean alreadyZero = true;
7        for (int value : nums) {
8            if (value != 0) {
9                alreadyZero = false;
10                break;
11            }
12        }
13        if (alreadyZero) return 0;
14
15        int left = 1;
16        int right = queries.length;
17        int answer = -1;
18
19        while (left <= right) {
20            int mid = left + (right - left) / 2;
21
22            if (canMakeZero(nums, queries, mid)) {
23                answer = mid;
24                right = mid - 1;
25            } else {
26                left = mid + 1;
27            }
28        }
29
30        return answer;
31    }
32
33    public static boolean canMakeZero(int[] nums, int[][] queries, int k) {
34        int n = nums.length;
35
36        for (int index = 0; index < n; index++) {
37            int needed = nums[index];
38            if (needed == 0) continue;
39
40            List<Integer> possibleValues = new ArrayList<>();
41
42            for (int q = 0; q < k; q++) {
43                int left = queries[q][0];
44                int right = queries[q][1];
45                int value = queries[q][2];
46
47                if (left <= index && index <= right) {
48                    possibleValues.add(value);
49                }
50            }
51
52            if (!subsetSum(possibleValues, needed)) {
53                return false;
54            }
55        }
56
57        return true;
58    }
59
60    public static boolean subsetSum(List<Integer> values, int target) {
61        boolean[] dp = new boolean[target + 1];
62        dp[0] = true;
63
64        for (int value : values) {
65            for (int sum = target; sum >= value; sum--) {
66                if (dp[sum - value]) {
67                    dp[sum] = true;
68                }
69            }
70        }
71
72        return dp[target];
73    }
74}
75