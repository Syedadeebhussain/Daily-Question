// Last updated: 5/10/2025, 6:34:18 pm
class Solution {
    public String makeGood(String s) {
    Stack<Character> st=new Stack<>();
    if(s.length()==0){
        return s;
    }
    // Difference between Capital letter and small letter is 32
    for(int i=0;i<s.length();i++){
        if(!st.isEmpty() && Math.abs(s.charAt(i)-st.peek())==32){
            st.pop();
        }
        else{
            st.push(s.charAt(i));
        }
    }
    StringBuilder st1=new StringBuilder(); 
    while(!st.isEmpty()){
     st1.append(st.pop());
    }
    return st1.reverse().toString();
    }
}