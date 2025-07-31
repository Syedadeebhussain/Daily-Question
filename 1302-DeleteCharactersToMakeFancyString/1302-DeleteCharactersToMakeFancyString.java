// Last updated: 31/7/2025, 2:24:54 pm
class Solution {
    public String makeFancyString(String s) {
        StringBuilder st=new StringBuilder();
        char p=0;
        int c=0;
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)==p){
            c++;
           }
           else{
            p=s.charAt(i);
            c=1;
           }
           if(c<3){
            st.append(s.charAt(i));
           }
        }
        return st.toString();
    }
}