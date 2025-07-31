// Last updated: 31/7/2025, 2:22:06 pm
class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
       int sum=0; 
       for(int i=0;i<nums.size();i++){
        // int number=;
        if(Integer.bitCount(i)==k){
            sum+=nums.get(i);
        }
       } 
       return sum;
    }
}