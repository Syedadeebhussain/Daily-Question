// Last updated: 31/7/2025, 2:25:47 pm
class Solution {
    public int countSegments(String s) {
        s=s.trim();
        if(s.length()>0)
        {
        String [] arr=s.split("\s+");
        return arr.length;
        }
            return 0;
    }
}