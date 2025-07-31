// Last updated: 31/7/2025, 2:25:35 pm
class Solution {
    public String reverseWords(String s) {
        String [] str=s.split(" ");
        StringBuilder st =new StringBuilder();
        for(int i=0;i<str.length;i++){
            StringBuilder st1 =new StringBuilder(str[i]).reverse();
            st.append(st1).append(" ");
        }
        st.deleteCharAt(st.length()-1);
        return st.toString();
    }
}