// Last updated: 26/8/2026, 9:23:24 pm
1class Solution {
2    public int longestSubarray(int[] nums) {
3        int ei=0;
4        int si=0;
5        int ans=0;
6        int res=0;
7        while(ei<nums.length){
8            if(nums[ei]==0){
9                ans++;
10            }
11            while(ans>1){
12                if(nums[si]==0){
13                    ans--;
14                }
15                si++;
16            }
17            res=Math.max(res,ei-si);
18            ei++;
19        } 
20        return res;
21    }
22}