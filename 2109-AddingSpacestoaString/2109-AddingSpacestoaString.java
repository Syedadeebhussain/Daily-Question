// Last updated: 3/8/2025, 8:56:31 am
class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder st=new StringBuilder();
        st.append(s.substring(0,spaces[0]));
        int i=1;
       for(;i<spaces.length;i++){
        st.append(" ");
        st.append(s.substring(spaces[i-1],spaces[i]));
       } 
       st.append(" ");
       st.append(s.substring(spaces[i-1]));
       return st.toString(); 
    }
}