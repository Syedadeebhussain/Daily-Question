// Last updated: 2/12/2025, 10:46:02 pm
1import java.util.*;
2
3class Solution {
4    public int[] twoSum(int[] nums, int target) {
5        HashMap<Integer, Integer> map = new HashMap<>(); 
6        for (int i = 0; i < nums.length; i++) {
7            int complement = target - nums[i];
8
9            if (map.containsKey(complement)) {
10                return new int[] { map.get(complement), i };
11            }
12
13            map.put(nums[i], i); 
14        }
15
16        return new int[] {}; 
17    }
18}
19