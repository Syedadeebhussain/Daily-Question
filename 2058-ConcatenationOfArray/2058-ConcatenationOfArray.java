// Last updated: 31/7/2025, 2:23:40 pm
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int [] arr=new int[2*n];
        for(int i=0;i<nums.length;i++)
        {
           arr[i]=nums[i];
           arr[i+n]=nums[i];
        }
        return arr;
    }
}