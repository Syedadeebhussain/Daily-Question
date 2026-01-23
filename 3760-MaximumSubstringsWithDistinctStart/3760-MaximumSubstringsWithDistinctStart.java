// Last updated: 23/1/2026, 9:39:46 am
1class Solution {
2    public int maxDistinct(String s) {
3     HashSet<Character> st=new HashSet<>();
4     for( char ch:s.toCharArray())
5     {
6        st.add(ch);
7     }
8     return st.size();
9    }
10}