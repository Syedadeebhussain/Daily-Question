// Last updated: 18/5/2026, 12:39:20 pm
1class Solution {
2    public int[] concatWithReverse(int[] nums) {
3      int [] arr=new int[2*nums.length];
4      for(int i=0;i<nums.length;i++){
5        arr[i]=nums[i];
6      }
7      for(int i=0;i<nums.length;i++){
8        arr[i+nums.length]=nums[nums.length-i-1];
9      }
10      return arr;
11    }
12}