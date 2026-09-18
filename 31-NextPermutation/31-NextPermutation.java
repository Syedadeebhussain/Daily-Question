// Last updated: 18/9/2026, 10:50:32 pm
1class Solution {
2    public void nextPermutation(int[] nums) {
3     int i=nums.length-2;
4     while(i>=0 && nums[i]>=nums[i+1]){
5            i--;
6     } 
7     if(i==-1)
8     { reverse(nums,0,nums.length-1);
9     return;
10     }
11     int j=nums.length-1;
12     while(i>=0 && j>=0 && nums[j]<=nums[i]){
13        j--;
14     }  
15     int temp=nums[i];
16     nums[i]=nums[j];
17     nums[j]=temp;
18     reverse(nums,i+1,nums.length-1);
19    }
20    public void reverse(int [] arr,int i,int j){
21        while(i<j){
22            int temp=arr[i];
23            arr[i]=arr[j];
24            arr[j]=temp;
25            i++;
26            j--;
27        }
28    }
29}