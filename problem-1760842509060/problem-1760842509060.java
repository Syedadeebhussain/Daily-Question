// Last updated: 19/10/2025, 8:25:09 am
class Solution {
    public int missingMultiple(int[] nums, int k) {
       Set<Integer> st=new HashSet<>();
        for(int i:nums){
            st.add(i);
        } 
        int ans=k;
        while(true){
            if(!st.contains(ans)){
                return ans;
            }
            ans+=k;
        }
    }
}