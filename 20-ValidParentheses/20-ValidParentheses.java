// Last updated: 1/10/2026, 10:46:16 pm
1class Solution {
2    public boolean isValid(String s) {
3     Stack<Character> st=new Stack<>();
4     for(int i=0;i<s.length();i++)
5     {
6        char ch=s.charAt(i);
7        if(ch=='(' || ch=='{' || ch=='[')
8        {
9            st.push(ch);
10        }
11        else
12        {
13        if(st.isEmpty())
14        {
15            return false;
16        }
17     char c=st.peek();
18     if((ch==')' && c!='(') || (ch==']' && c!='[') || (ch=='}' && c!='{'))
19       {
20       return false;
21        }
22        st.pop();
23     }  
24    
25    }
26    return st.isEmpty();
27}
28}