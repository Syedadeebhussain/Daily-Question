// Last updated: 31/7/2025, 2:27:30 pm
class Solution {
    public int lengthOfLastWord(String s) {
        return find(s);
    }
    public static int find(String s)
    {
        s=s.trim();
        int r=(s.length()-s.lastIndexOf(" "))-1;
        return r;
    }
}