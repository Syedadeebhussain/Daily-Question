// Last updated: 19/10/2025, 8:38:03 am
class Solution {
    public int longestBalanced(int[] nums) {
      int ei=0;
      int ans=0;
      for( ei=0;ei<nums.length;ei++){
        Set<Integer> odd=new HashSet<>();
          Set<Integer> even =new HashSet<>();
          for(int i=ei;i<nums.length;i++){
              if(nums[i]%2==0){
                  even.add(nums[i]);
              }
              else{
                  odd.add(nums[i]);
              }
              if(odd.size()==even.size()){
                  ans=Math.max(ans,i-ei+1);
              }
          }
      }
        return ans;
    }
}