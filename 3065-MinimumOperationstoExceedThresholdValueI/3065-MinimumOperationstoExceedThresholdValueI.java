// Last updated: 16/10/2025, 10:01:57 pm
class Solution {
    public int minOperations(int[] nums, int k) {
        int totalOperations = 0;
        for(int n : nums){
            if(n >= k){
                totalOperations++;
            }
        }
        return nums.length - totalOperations;
    }
}