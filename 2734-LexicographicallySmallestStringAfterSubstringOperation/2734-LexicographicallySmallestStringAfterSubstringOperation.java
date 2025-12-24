// Last updated: 24/12/2025, 12:53:25 pm
1class Solution {
2    public String smallestString(String s) {
3       StringBuilder st=new StringBuilder(s);
4       int i=0;
5       while(i<s.length() && s.charAt(i)=='a'){
6        i++;
7       }
8       if(i==s.length()){
9        st.setCharAt(s.length()-1,'z');
10        return st.toString();
11       }
12       while(i<s.length() && s.charAt(i)!='a'){
13        st.setCharAt(i,(char)(s.charAt(i)-1));
14        i++;
15       }
16
17       return st.toString();
18
19    }
20}