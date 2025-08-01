// Last updated: 31/7/2025, 2:25:41 pm
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        int [] ans=new int [nums2.length];
        for(int i=0;i<nums2.length;i++){
            while(!st.isEmpty() && nums2[i]>nums2[st.peek()]){
                ans[st.pop()]=nums2[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        int [] arr=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
             int index = -1;
            for(int i1=0;i1<nums2.length;i1++){
                if(nums1[i]==nums2[i1]){
                    index=i1;
                    break;
                }
            }
            arr[i]=ans[index];
        }
        return arr;
    }
}