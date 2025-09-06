// Last updated: 6/9/2025, 10:30:22 pm
class Solution {
    public int minOperations(int[] nums, int k) {
      int s = 0;
        for(int i=0; i<nums.length; i++){
            s += nums[i];
        }
        if(s%k == 0){
            return 0;
        }else{
            return s%k;
        }
    }
}