// Last updated: 13/11/2025, 10:19:00 pm
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