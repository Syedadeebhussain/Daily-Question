// Last updated: 2/2/2026, 7:30:32 pm
1class Solution {
2    public int[] nextGreaterElements(int[] arr) {
3        int n=arr.length;
4        Stack<Integer> st=new Stack<>();
5        int [] ans=new int[n];
6        Arrays.fill(ans, -1);
7       for(int i=0;i<2*n;i++){
8        while(!st.isEmpty() && arr[(i%n)]>arr[st.peek()]){
9            ans[st.pop()]=arr[i%n];
10        }
11        if(i<n){ //Push only in the FIRST pass
12        st.push(i%n);
13        }
14       }
15       return ans;
16    }
17}