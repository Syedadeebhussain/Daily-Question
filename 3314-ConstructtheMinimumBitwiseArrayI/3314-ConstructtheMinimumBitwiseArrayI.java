// Last updated: 23/1/2026, 10:13:19 am
1class Solution {
2    public int[] minBitwiseArray(List<Integer> nums) {
3       int [] ans=new int[nums.size()];
4       Arrays.fill(ans,-1);
5       for(int i=0;i<nums.size();i++){
6        for(int j=0;j<nums.get(i);j++){
7            if((j|j+1)==nums.get(i)){
8                ans[i]=j;
9                break;
10            }
11        }
12       } 
13        return ans;
14    }
15}