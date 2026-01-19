// Last updated: 19/1/2026, 10:20:16 pm
1class Solution {
2    public int longestBalanced(int[] nums) {
3      int ei=0;
4      int ans=0;
5      for( ei=0;ei<nums.length;ei++){
6        Set<Integer> odd=new HashSet<>();
7          Set<Integer> even =new HashSet<>();
8          for(int i=ei;i<nums.length;i++){
9              if(nums[i]%2==0){
10                  even.add(nums[i]);
11              }
12              else{
13                  odd.add(nums[i]);
14              }
15              if(odd.size()==even.size()){
16                  ans=Math.max(ans,i-ei+1);
17              }
18          }
19      }
20        return ans;
21    }
22}