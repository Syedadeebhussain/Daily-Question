// Last updated: 19/4/2026, 10:26:45 pm
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3    int n = nums.length;
4    int[] leftMax = new int[n];
5    int[] rightMin = new int[n];
6    leftMax[0] = nums[0];
7    for (int i = 1; i <n; i++) {
8        leftMax[i] = Math.max(leftMax[i - 1], nums[i]);
9    }
10    rightMin[n - 1] = nums[n - 1];
11    for (int i = n - 2; i >= 0; i--) {
12        rightMin[i] = Math.min(rightMin[i + 1], nums[i]);
13    }
14    for (int i = 0; i < n; i++) {
15        if (leftMax[i] - rightMin[i] <= k) {
16            return i;
17        }
18    }
19    return -1;
20    }
21    }