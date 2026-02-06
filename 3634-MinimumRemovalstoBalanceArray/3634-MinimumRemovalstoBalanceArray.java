// Last updated: 6/2/2026, 11:30:26 pm
1class Solution {
2    public int minRemoval(int[] nums, int k) {
3     Arrays.sort(nums);
4     int ei=0;
5     int si=0;
6     int ans=0;
7     int c=0;
8     while(ei<nums.length){
9        c++;
10        while(c>1 && nums[ei]>(long)k*nums[si]){
11            c--;
12            si++;
13        }
14        ans=Math.max(ans,ei-si+1);
15           ei++;
16     }   
17     return nums.length-ans;
18    }
19}