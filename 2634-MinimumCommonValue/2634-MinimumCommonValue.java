// Last updated: 5/8/2025, 2:59:24 pm
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
    Set<Integer> st=new HashSet<>();
    int min=Integer.MAX_VALUE;
    boolean found=false;
    for(int i=0;i<nums1.length;i++){
        st.add(nums1[i]);
    } 
    for(int i1=0;i1<nums2.length;i1++){
        if(st.contains(nums2[i1])){
            min=Math.min(min,nums2[i1]);
            found=true;
        }
    }
    return found?min:-1;
    }
}