// Last updated: 31/7/2025, 2:26:04 pm
class Solution {
    public int findDuplicate(int[] nums) {
    Arrays.sort(nums);
    // for(int i=0;i<nums.length-1;i++){
    //     for(int j=i+1;j<nums.length;j++){
    //         if(nums[i]==nums[j]){
    //             return nums[i];
    //         }
    // }
    // }
    // return 0;
  for(int i=0;i<nums.length-1;i++){
    if(nums[i]==nums[i+1]){
        return nums[i];
    }
  }
  return 0;
}
}