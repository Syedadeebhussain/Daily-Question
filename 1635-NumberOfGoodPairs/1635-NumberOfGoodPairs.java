// Last updated: 31/7/2025, 2:24:25 pm
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int c=0;
       for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums.length;j++){
            if(i<j && nums[i] == nums[j] )
            {
                c++;
            }
        }
       } 
       return c;
    }
}