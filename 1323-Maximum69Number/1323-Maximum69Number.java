// Last updated: 16/8/2025, 10:23:03 am
class Solution {
    public int maximum69Number(int num) {
        String s = Integer.toString(num);
        s = s.replaceFirst("6", "9"); 
        return Integer.parseInt(s);
    }
}
