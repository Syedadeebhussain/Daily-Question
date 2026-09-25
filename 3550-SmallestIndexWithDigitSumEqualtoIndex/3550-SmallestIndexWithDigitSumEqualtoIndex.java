// Last updated: 25/9/2026, 10:00:12 pm
1class Solution {
2    public int smallestIndex(int[] nums) {
3        for (int i = 0; i < nums.length; i++) {
4            if (sum(nums[i]) == i) {
5                return i;
6            }
7        }
8        return -1;
9    }
10
11    public int sum(int n) {
12        int sum = 0;
13        while (n > 0) {
14            sum += n % 10;
15            n = n / 10;
16        }
17        return sum;
18    }
19}
20