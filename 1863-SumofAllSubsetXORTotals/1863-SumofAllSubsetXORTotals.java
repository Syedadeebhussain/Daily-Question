// Last updated: 29/12/2025, 10:02:07 pm
1class Solution {
2    int total=0;
3    public int subsetXORSum(int[] nums) {
4        Arrays.sort(nums);
5       find(nums,0,0); 
6       return total;
7    }
8    public void find(int [] nums,int idx,int xor){
9        total+=xor;
10        for(int i=idx;i<nums.length;i++){
11            find(nums,i+1,xor^nums[i]);
12        }
13    }
14}