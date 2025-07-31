// Last updated: 31/7/2025, 2:21:28 pm
class Solution {
    public int[] transformArray(int[] nums) {
    int [] ans=new int[nums.length];
    for(int i=0;i<ans.length;i++){
       
       ans[i] = (nums[i] % 2 == 0) ? 0 : 1;
    }    
    Arrays.sort(ans);
    return ans;
    }
}