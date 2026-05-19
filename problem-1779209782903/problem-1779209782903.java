// Last updated: 19/5/2026, 10:26:22 pm
1class Solution {
2    public int getCommon(int[] nums1, int[] nums2) {
3      HashSet<Integer> st=new HashSet<>();
4      for(int i=0;i<nums1.length;i++){
5        st.add(nums1[i]);
6      }  
7      for(int i=0;i<nums2.length;i++){
8        if(st.contains(nums2[i])) return nums2[i];
9      }
10      return -1;
11    }
12}