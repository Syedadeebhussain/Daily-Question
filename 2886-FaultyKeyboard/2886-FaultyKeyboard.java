// Last updated: 31/7/2025, 2:22:14 pm
class Solution {
    public String finalString(String s) {
    StringBuilder st =new StringBuilder();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='i'){
            st.reverse();
        }
        else{
            st.append(ch);
                    }
    }
    return st.toString();
    }
}