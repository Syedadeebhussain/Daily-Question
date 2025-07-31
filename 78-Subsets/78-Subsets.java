// Last updated: 31/7/2025, 2:27:18 pm
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    List<Integer> ll=new ArrayList<>();
    List<List<Integer>> ans=new ArrayList<>();
    print(nums,ans,ll,0);
    return ans;
    }
    public static void print(int [] nums,List<List<Integer>> ans,List<Integer> ll,int idx)
    {
        if(idx==nums.length)
        {
            ans.add(new ArrayList<>(ll));
            return ;
        }
        print(nums,ans,ll,idx+1);
        ll.add(nums[idx]);
        print(nums,ans,ll,idx+1);
        ll.remove(ll.size()-1);
    }
}