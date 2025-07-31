// Last updated: 31/7/2025, 2:24:53 pm
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] nums) {
    Arrays.sort(nums);
   
    List<List<Integer>> ans=new ArrayList<>();
    int diff=Integer.MAX_VALUE;
    for(int i=0;i<nums.length-1;i++)
    {
        int d=nums[i+1]-nums[i];
        if(d<diff){
            diff=d;
        }
    }
    for(int i=0;i<nums.length-1;i++)
    {
        if((nums[i+1]-nums[i])==diff)
        {
             List<Integer> ll=new ArrayList<>();
            ll.add(nums[i]);
            ll.add(nums[i+1]);
             ans.add(ll);
        }
        
    }
    return ans;
    }
}