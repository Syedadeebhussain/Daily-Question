// Last updated: 16/1/2026, 10:00:40 pm
1class Solution {
2    public int minElements(int[] nums, int limit, int goal) {
3        long sum = 0;
4        for (int num : nums) {
5            sum += num;
6        }
7        long diff = Math.abs(goal - sum);
8        return (int)((diff + limit - 1) / limit);
9    }
10}
11