// Last updated: 3/11/2025, 8:19:25 pm
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        List<Integer>ll=new ArrayList<>();
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
            st.add(nums[i]);
        }
        for(int i=min;i<=max;i++){
            if(!st.contains(i)){
                ll.add(i);
            }
        }
       return ll;
    }
}