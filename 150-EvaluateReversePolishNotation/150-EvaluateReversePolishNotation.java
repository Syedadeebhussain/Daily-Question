// Last updated: 1/4/2026, 9:38:29 pm
1class Solution {
2    public int evalRPN(String[] tokens) {
3        Stack<Integer> st = new Stack<>();
4        for (int i = 0; i < tokens.length; i++) {
5            String c = tokens[i];
6            if (!c.equals("+") && !c.equals("-") && !c.equals("*") && !c.equals("/")) {
7                st.push(Integer.parseInt(c));
8            } 
9            else {
10                int a = st.pop(); 
11                int b = st.pop(); 
12                if (c.equals("+")) {
13                    st.push(b+a);
14                } 
15                else if(c.equals("-")) {
16                    st.push(b-a);
17                } 
18                else if(c.equals("*")) {
19                    st.push(b*a);
20                } 
21                else{
22                    st.push(b/a);
23                }
24            }
25        }
26        return st.peek();
27    }
28}