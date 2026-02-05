// Last updated: 5/2/2026, 12:25:44 pm
1class Solution {
2    public int[] constructTransformedArray(int[] nums) {
3      int n=nums.length;
4      int [] arr=new int[nums.length];
5      for(int i=0;i<nums.length;i++){
6        if(nums[i]>0){
7        int new_idx=(i+nums[i])%n;
8        arr[i]=nums[new_idx];
9        }
10        else if(nums[i]<0){
11        int new_idx=(i-Math.abs(nums[i]))%n;
12        if(new_idx<0){
13            new_idx+=n;
14        }
15        arr[i]=nums[new_idx];
16        }
17        else {
18            arr[i]=nums[i];
19        }
20      }  
21      return arr;
22    }
23}