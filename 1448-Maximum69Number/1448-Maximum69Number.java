// Last updated: 31/7/2025, 2:24:44 pm
class Solution {
    public int maximum69Number(int num) {
        String s = Integer.toString(num);
        s = s.replaceFirst("6", "9"); 
        return Integer.parseInt(s);
    }
}
