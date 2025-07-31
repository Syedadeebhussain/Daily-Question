// Last updated: 31/7/2025, 2:23:29 pm
class Solution {
    public int numOfPairs(String[] nums, String target) {
        int c=0;
    for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums.length;j++){
            String s=nums[i]+nums[j];
            if(i!=j && s.equals(target)){
                c++;
            }
        }
    }
    return c;
    }
}