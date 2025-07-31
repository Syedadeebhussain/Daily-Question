// Last updated: 31/7/2025, 2:25:25 pm
class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int [] ans=new int [arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
             int id= st.pop();
             ans[id]=i-id;
            }
            st.push(i);
        }
        return ans;
    }
}