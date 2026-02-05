// Last updated: 5/2/2026, 11:15:02 pm
1class Solution {
2    public int minLength(String s) {
3     Stack<Character> st=new Stack<>();
4     for(int i=0;i<s.length();i++){
5        if(!st.isEmpty() && ((s.charAt(i)=='B' && st.peek()=='A') || (s.charAt(i)=='D' && st.peek()=='C'))){
6            st.pop();
7        }
8        else{
9            st.push(s.charAt(i));
10        }
11     }   
12     StringBuilder st1=new StringBuilder(); 
13    while(!st.isEmpty()){
14     st1.append(st.pop());
15    }
16    return st1.length();
17    }
18}