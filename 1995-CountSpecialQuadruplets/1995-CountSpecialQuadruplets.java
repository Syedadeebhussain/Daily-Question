// Last updated: 13/1/2026, 2:56:27 pm
1class Solution {
2    public int countQuadruplets(int[] nums) {
3        int c=0;
4        for(int i=0;i<=nums.length-4;i++){
5            for(int j=i+1;j<=nums.length-3;j++){
6                for(int k=j+1;k<=nums.length-2;k++){
7                    for(int l=k+1;l<=nums.length-1;l++)
8                    if(nums[i]+nums[j]+nums[k]==nums[l]){
9                        c++;
10                    }
11                }
12            }
13        }
14        return c;
15    }
16}