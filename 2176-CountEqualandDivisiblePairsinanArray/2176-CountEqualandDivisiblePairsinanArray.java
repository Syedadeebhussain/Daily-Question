// Last updated: 1/12/2025, 10:24:49 pm
1class Solution {
2    public int countPairs(int[] nums, int k) {
3        int c=0;
4        for(int i=0;i<nums.length;i++){
5            for(int j=i+1;j<nums.length;j++){
6                if((nums[i]==nums[j]) && (i*j)%k==0){
7                    c++;
8                }
9            }
10        }
11        return c;
12    }
13}