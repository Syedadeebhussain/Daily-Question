// Last updated: 26/12/2025, 6:29:07 pm
1class Solution {
2    public int getCommon(int[] nums1, int[] nums2) {
3    Set<Integer> st=new HashSet<>();
4    int min=Integer.MAX_VALUE;
5    boolean found=false;
6    for(int i=0;i<nums1.length;i++){
7        st.add(nums1[i]);
8    } 
9    for(int i1=0;i1<nums2.length;i1++){
10        if(st.contains(nums2[i1])){
11            min=Math.min(min,nums2[i1]);
12            found=true;
13        }
14    }
15    return found?min:-1;
16    }
17}