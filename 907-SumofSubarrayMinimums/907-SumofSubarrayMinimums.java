// Last updated: 19/1/2026, 11:36:22 am
1class Solution {
2    public int sumSubarrayMins(int[] arr) {
3        int n=arr.length;
4        long sum=0;
5        int mod = 1000000007;
6        int [] left=new int [n];
7        int [] right=new int [n];
8        Stack<Integer> st=new Stack<>();
9        for(int i=0;i<n;i++){
10        while(!st.isEmpty() && arr[st.peek()]>arr[i]){
11            st.pop();
12        }
13        left[i]=st.isEmpty()?i+1:i-st.peek();
14        st.push(i);
15        }
16        st.clear();
17        for(int i=n-1;i>=0;i--){
18        while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
19            st.pop();
20        }
21        right[i]=st.isEmpty()?n-i:st.peek()-i;
22        st.push(i);
23        }
24        for (int i = 0; i < n; i++) {
25            sum = (sum + (long) arr[i] * left[i] * right[i]) % mod;
26        }
27        return (int) sum;
28    }
29}