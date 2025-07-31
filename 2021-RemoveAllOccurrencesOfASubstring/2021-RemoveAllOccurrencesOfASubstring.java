// Last updated: 31/7/2025, 2:23:45 pm
class Solution {
    public String removeOccurrences(String s, String part) {
        while(s.contains(part)){
        int startIndex = s.indexOf(part);
        int endIndex = startIndex + part.length();
         s = s.substring(0, startIndex) + s.substring(endIndex);
        }
        return s;
    }
}