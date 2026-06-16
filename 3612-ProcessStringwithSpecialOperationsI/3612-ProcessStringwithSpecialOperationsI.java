// Last updated: 16/6/2026, 11:55:23 pm
1class Solution {
2    public String processStr(String s) {
3      StringBuilder st =new StringBuilder();
4        for(int i=0;i<s.length();i++){
5            if((Character.isLowerCase(s.charAt(i)))){
6                st.append(s.charAt(i));
7            }
8            else if(s.charAt(i)=='*'){
9                if (st.length() > 0) {
10        st.deleteCharAt(st.length() - 1);
11    }
12            }else if(s.charAt(i)=='#'){
13                st.append(st);
14            }
15            else if(s.charAt(i)=='%'){
16                st.reverse();
17            }
18        }
19      return   st.toString();
20    }
21}