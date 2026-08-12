// Last updated: 12/8/2026, 1:20:08 pm
1class Solution {
2    public int maxSubarrayLength(int[] nums, int k) {
3    HashMap<Integer,Integer> mp=new HashMap<>();
4    int ei=0;
5    int si=0;
6    int ans=0;
7    while(ei<nums.length){
8        mp.put(nums[ei],mp.getOrDefault(nums[ei],0)+1);
9        while(mp.get(nums[ei])>k){
10            mp.put(nums[si],mp.get(nums[si])-1);
11            if(mp.get(nums[si])==0){
12                mp.remove(nums[si]);
13            }
14            si++;
15        }
16        ans=Math.max(ans,ei-si+1);
17        ei++;
18    } 
19    return ans;
20    }
21}