// Last updated: 20/1/2026, 11:19:59 pm
1class Solution {
2    public int findKOr(int[] nums, int k) {
3        int ans=0;
4        for(int i=0;i<32;i++){
5        int c=0;
6        for(int j=0;j<nums.length;j++){
7            if(((nums[j]>>i)&1)==1){
8                c++;
9            }
10        }
11        if(c>=k){
12            ans|=(1<<i);
13        }
14        }
15        return ans;
16
17    }
18}