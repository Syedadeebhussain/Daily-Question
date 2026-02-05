// Last updated: 5/2/2026, 11:16:33 pm
class Solution {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if (!stack.isEmpty() && ((c == 'B' && stack.peek() == 'A') || (c == 'D' && stack.peek() == 'C'))){
                stack.pop();
                continue;
            }
            stack.push(c);
        }
        return stack.size();
    }
}