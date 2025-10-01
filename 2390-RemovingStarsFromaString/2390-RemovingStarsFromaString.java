// Last updated: 1/10/2025, 8:16:47 pm
class Solution {
    public String removeStars(String s) {
      Stack<Character> st=new Stack<>();
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='*'){
           st.pop();
        }
        else{
            st.push(s.charAt(i));
        }
      }  
       StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
      return sb.reverse().toString();
    }
}