// Last updated: 31/7/2025, 2:27:50 pm
class Solution {
    public int strStr(String haystack, String needle) {
        return find(haystack,needle);
    }
    public static int find(String str,String n)
    {
        int r=str.indexOf(n);
        return r;
    }
}