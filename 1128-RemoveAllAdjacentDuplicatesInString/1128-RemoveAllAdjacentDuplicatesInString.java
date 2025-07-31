// Last updated: 31/7/2025, 2:25:01 pm
class Solution {
    public String removeDuplicates(String s) {
        String ans="";
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(stack.isEmpty() || stack.peek() != s.charAt(i)){
               stack.push(s.charAt(i));
            }
            else{
                 stack.pop();
            }
        }
        StringBuilder result  = new StringBuilder();
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }
}