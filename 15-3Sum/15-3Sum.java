// Last updated: 27/6/2026, 9:44:03 pm
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3    Arrays.sort(nums);
4    List<List<Integer>> ll=new ArrayList<>();
5    for(int i=0;i<=nums.length-3;i++){
6    if(i>0 && nums[i]==nums[i-1]) continue;
7    int fix=nums[i];
8    int lo=i+1;
9    int hi=nums.length-1;
10    while(lo<hi){
11       int sum=fix+nums[lo]+nums[hi];
12       if(sum==0){
13       ll.add(new ArrayList<>(Arrays.asList(fix, nums[lo], nums[hi])));
14       while(lo<hi && nums[lo]==nums[lo+1]){
15        lo++;
16       }
17        while(lo<hi && nums[hi]==nums[hi-1]){
18        hi--;
19       }
20
21        lo++;
22        hi--;
23       }
24       else if(sum<0){
25           lo++;
26       }
27       else{
28        hi--;
29       }
30    }
31    }
32    return ll;
33    }
34}