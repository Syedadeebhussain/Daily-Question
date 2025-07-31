// Last updated: 31/7/2025, 2:21:26 pm
class Solution {
    public int maxSum(int[] nums) {
     Set<Integer> st = new HashSet<>();
     int sum=0;
     int max=Integer.MIN_VALUE;
     for(int ele:nums){
        max=Math.max(ele,max);
        if(ele>0 && !st.contains(ele)){
         
        sum+=ele;
        st.add(ele);
        }
        
     }
     if(max<0){
        return max;
     }
     return sum;
    }
}