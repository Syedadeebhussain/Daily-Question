// Last updated: 31/7/2025, 2:21:44 pm
// class Solution {
//     public String clearDigits(String s) {
//      Stack<Character> st=new Stack<>();
//      if(!Character.isDigit(s.charAt(0))){
//         st.push(s.charAt(0));
//      }
//      for(int i=1;i<s.length();i++){
//         if( Character.isDigit(s.charAt(i))){
//             st.pop();
//         }
//         else{
//             st.push(s.charAt(i));
//         }
//      }
//      String ans="";
//     while (!st.isEmpty()) {
//     ans = st.pop() + ans;
// }
//      return ans;
//     }
// }
class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        String ans="";
    while (!st.isEmpty()) {
    ans = st.pop() + ans;
     }
     return ans;
    }
}