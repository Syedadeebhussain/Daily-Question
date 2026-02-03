// Last updated: 3/2/2026, 10:41:33 am
1class Solution {
2    public boolean isTrionic(int[] nums) {
3    for(int i=1;i<nums.length-2;i++){
4        for(int j=i+1;j<nums.length-1;j++){
5    if(isIncreasing(0,i,nums) && isDecreasing(i,j,nums) && isIncreasing(j,nums.length-1,nums)){
6                    return true;
7                }
8        }
9    }    
10        return false;
11    }
12    public boolean isIncreasing(int i,int j,int [] nums){
13       
14        for(int a=i;a<j;a++){
15            if(nums[a]>=nums[a+1]){
16                return false;
17            }
18        }
19        return true;
20    }
21    public boolean isDecreasing(int i,int j,int [] nums){
22     
23        for(int a=i;a<j;a++){
24            if(nums[a]<=nums[a+1]){
25                return false;
26            }
27        }
28        return true;
29    }
30    
31}