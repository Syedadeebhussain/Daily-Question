// Last updated: 28/10/2025, 10:51:09 pm
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