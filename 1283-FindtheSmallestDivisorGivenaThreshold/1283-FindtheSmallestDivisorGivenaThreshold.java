// Last updated: 19/12/2025, 9:24:38 am
1class Solution {
2    public int smallestDivisor(int[] nums, int threshold) {
3    int low=1;
4    int high=0;
5    for(int i=0;i<nums.length;i++){
6        high=Math.max(high,nums[i]);
7    }
8    int ans=0;
9    while(low<=high){
10        int mid=low+(high-low)/2;
11        if(possible(nums,mid,threshold)){
12            ans=mid;
13            high=mid-1;
14        }
15        else{
16            low=mid+1;
17        }
18    }
19    return ans;
20    }
21    public boolean possible(int [] nums,int mid,int max){
22        int s=0;
23        for(int i:nums)
24        {
25            s+=Math.ceil(i*1.0/mid);
26        }
27        return s<=max;
28    }
29}