// Last updated: 31/7/2025, 2:22:53 pm
class Solution {
    public int longestNiceSubarray(int[] nums) {
    int si=0;
    int ei=0;
    int ans=0;
    int a=0;
    while(ei<nums.length)
    {
        //grow
        while((a & nums[ei])!=0){
            a=a ^ nums[si];
            si++;
        }
        
        a=a | nums[ei];//shrink
        ans=Math.max(ans,ei-si+1);//ans
        ei++;
    }
    return ans;
    }
}