// Last updated: 31/7/2025, 2:21:23 pm
class Solution {
    public String processStr(String s) {
      StringBuilder st =new StringBuilder();
        for(int i=0;i<s.length();i++){
            if((Character.isLowerCase(s.charAt(i)))){
                st.append(s.charAt(i));
            }
            else if(s.charAt(i)=='*'){
                if (st.length() > 0) {
        st.deleteCharAt(st.length() - 1);
    }
            }else if(s.charAt(i)=='#'){
                st.append(st);
            }
            else if(s.charAt(i)=='%'){
                st.reverse();
            }
        }
      return   st.toString();
    }
}