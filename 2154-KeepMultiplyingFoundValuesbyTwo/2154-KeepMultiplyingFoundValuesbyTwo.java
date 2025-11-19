// Last updated: 19/11/2025, 8:30:17 am
class Solution {
    public int findFinalValue(int[] nums, int original) {
       Set<Integer> st=new HashSet<>();
       for(int i=0;i<nums.length;i++){
        st.add(nums[i]);
       } 
       while(st.contains(original)){
        original*=2;
       }
       return original;
    }
}