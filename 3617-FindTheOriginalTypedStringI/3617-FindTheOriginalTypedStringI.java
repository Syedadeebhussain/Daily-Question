// Last updated: 31/7/2025, 2:21:34 pm
class Solution {
    public int possibleStringCount(String word) {
        int ans = 1;  
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                ans++;
            }
        }
        return ans;
    }
}
