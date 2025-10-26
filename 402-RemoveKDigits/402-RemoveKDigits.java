// Last updated: 26/10/2025, 7:13:26 pm
class Solution {
    public String removeKdigits(String num, int k) {
     Stack<Character> st=new Stack<>();
     st.push(num.charAt(0));
     for(int i=1;i<num.length();i++){
        while(!st.isEmpty() && k>=1 && st.peek()-'0'>num.charAt(i)-'0'){
            st.pop();
            k--;
        }
        st.push(num.charAt(i));
     }
     while(k>0){
        st.pop();
        k--;
     }
     if(st.isEmpty()){
        return "0";
     }
     StringBuilder str=new StringBuilder();
     while(!st.isEmpty()){
        str.append(st.pop());
     }
    str.reverse();
     while(str.length()>1 && str.charAt(0)=='0') {
            str.deleteCharAt(0);
        }
     return str.length() == 0 ? "0" : str.toString();
    }
}