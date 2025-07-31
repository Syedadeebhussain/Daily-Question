// Last updated: 31/7/2025, 2:22:18 pm
// class Solution {
//     public int findNonMinOrMax(int[] nums) {
//      Arrays.sort(nums);
//      if(nums.length>2){
//      return nums[nums.length-2];   

//      }
//      return -1;
//     }
// }
class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            min=Math.min(nums[i],min);
        }
         for (int num : nums) {
            if (num != min && num != max) return num;
        }

        return -1;
    }
}