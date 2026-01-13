// Last updated: 13/1/2026, 2:26:28 pm
1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3        List<List<Integer>> ans=new ArrayList<>();
4        Arrays.sort(nums);
5        for( int i=0;i<=nums.length-4;i++){
6            if(i>0 && nums[i]==nums[i-1]) continue;
7            int fix1=nums[i];
8            for(int j=i+1;j<=nums.length-3;j++){
9              if(j>i+1 && nums[j]==nums[j-1]) continue;
10                int fix2=nums[j];
11                int lo=j+1;
12                int hi=nums.length-1;
13                while(lo<hi){
14                    long sum=(long)fix1+fix2+nums[lo]+nums[hi];
15                    if(sum==target){
16                        ans.add(new ArrayList<>(Arrays.asList(fix1,fix2,nums[lo],nums[hi])));
17                        while(lo<hi && nums[lo]==nums[lo+1]) lo++;
18                         while(lo<hi &&  nums[hi]==nums[hi-1]) hi--;
19                        hi--;
20                        lo++;
21                    }
22                    else if(sum<target){
23                        lo++;
24                    }
25                    else{
26                        hi--;
27                    }
28                }
29            }
30        }
31        return ans;
32    }
33}