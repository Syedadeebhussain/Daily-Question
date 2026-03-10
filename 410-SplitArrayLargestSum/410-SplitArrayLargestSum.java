// Last updated: 10/3/2026, 11:01:09 pm
1class Solution {
2    public int splitArray(int[] nums, int k) {
3        int lo=0;
4        int hi=0;
5        for(int i:nums){
6            lo=Math.max(lo,i);
7            hi+=i;
8        }
9        int ans=0;
10        while(lo<=hi){
11            int mid=lo+(hi-lo)/2;
12            if(ispossible(nums,k,mid)){
13                ans=mid;
14                hi=mid-1;
15            }
16            else{
17                lo=mid+1;
18            }
19        }
20        return ans;
21    }
22    public boolean ispossible(int [] nums,int k,int mid){
23        int sum=0;
24        int c=1;
25        for(int i:nums){
26            if(sum+i<=mid){
27                sum+=i;
28            }
29            else{
30                sum=i;
31                c++;
32            }
33            if(c>k) return false;
34        }
35        return true;
36
37    }
38}