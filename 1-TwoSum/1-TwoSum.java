// Last updated: 13/2/2026, 9:48:36 pm
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3    HashMap<Integer,Integer> mp=new HashMap<>();
4    for(int i=0;i<nums.length;i++){
5        int s=nums[i];
6        if(mp.containsKey(target-s)){
7            return new int[]{i,mp.get(target-s)};
8        }
9        mp.put(s,i);
10    }
11    return new int[]{};
12    }
13}