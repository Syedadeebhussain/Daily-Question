// Last updated: 10/1/2026, 12:39:43 pm
1class Solution {
2    public int[] asteroidCollision(int[] asteroids) {
3
4    Stack<Integer> st=new Stack<>();
5    for(int i=0;i<asteroids.length;i++){
6        int cur=asteroids[i];
7         boolean destroyed = false;
8        while(!st.isEmpty() && st.peek()>0 && cur<0){
9            int sum=cur+st.peek();
10            if(sum<0){
11                st.pop();
12            }
13            else if(sum==0){ // both destrioyed
14                st.pop();
15                destroyed=true;
16                break;
17
18            }
19            else if(sum>0){
20                destroyed=true;
21                break;
22            }
23        }
24        if (!destroyed) {
25            st.push(cur);
26        }
27    }
28     int[] ans = new int[st.size()];
29        for (int i = ans.length - 1; i >= 0; i--) {
30            ans[i] = st.pop();
31        }
32
33        return ans;
34    }
35}