// Last updated: 31/7/2025, 2:22:11 pm
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int c=0;
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                if(nums.get(i)+nums.get(j)<target)
                {
                    c++;
                }
            }
        }
        return c;
    }
}