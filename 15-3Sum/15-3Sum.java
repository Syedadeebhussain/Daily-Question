// Last updated: 26/9/2025, 7:40:57 pm
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> ll=new ArrayList<>();
    for(int i=0;i<=nums.length-3;i++){
    if(i>0 && nums[i]==nums[i-1]) continue;
    int fix=nums[i];
    int lo=i+1;
    int hi=nums.length-1;
    while(lo<hi){
       int sum=fix+nums[lo]+nums[hi];
       if(sum==0){
       ll.add(new ArrayList<>(Arrays.asList(fix, nums[lo], nums[hi])));
       while(lo<hi && nums[lo]==nums[lo+1]){
        lo++;
       }
        while(lo<hi && nums[hi]==nums[hi-1]){
        hi--;
       }

        lo++;
        hi--;
       }
       else if(sum<0){
           lo++;
       }
       else{
        hi--;
       }
    }
    }
    return ll;
    }
}