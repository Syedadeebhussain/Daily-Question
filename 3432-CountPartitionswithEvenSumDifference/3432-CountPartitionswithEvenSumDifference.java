// Last updated: 5/12/2025, 10:31:51 pm
1class Solution {
2    public int countPartitions(int[] nums) {
3        int totalSum = 0;
4        for (int num : nums) {
5            totalSum += num;
6        }
7        int leftSum = 0;
8        int count = 0;
9        for (int i = 0; i < nums.length - 1; i++) {
10            leftSum += nums[i];
11            int rightSum = totalSum - leftSum;
12
13            if (leftSum % 2 == rightSum % 2) {
14                count++;
15            }
16        }
17
18        return count;
19    }
20}
21