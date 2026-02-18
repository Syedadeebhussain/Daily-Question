// Last updated: 18/2/2026, 9:21:22 am
1class MyQueue {
2    Stack<Integer> st;
3    Stack<Integer> st1;
4    public MyQueue() {
5        st=new Stack<>();
6        st1=new Stack<>();
7    }
8    public void push(int x) {
9        while(!st.isEmpty()){
10          st1.push(st.pop());
11        }
12        st.push(x);
13
14        while(!st1.isEmpty()){
15            st.push(st1.pop());
16        }
17    }
18    
19    public int pop() {
20        return st.pop();
21    }
22    
23    public int peek() {
24        return st.peek();
25    }
26    
27    public boolean empty() {
28        return st.isEmpty();
29    }
30}
31
32/**
33 * Your MyQueue object will be instantiated and called as such:
34 * MyQueue obj = new MyQueue();
35 * obj.push(x);
36 * int param_2 = obj.pop();
37 * int param_3 = obj.peek();
38 * boolean param_4 = obj.empty();
39 */