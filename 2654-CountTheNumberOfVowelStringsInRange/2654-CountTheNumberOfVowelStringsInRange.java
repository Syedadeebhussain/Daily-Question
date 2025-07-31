// Last updated: 31/7/2025, 2:22:37 pm
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int c = 0;
        for (int i = left; i <= right; i++) {
            String str = words[i];
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            
            if (isVowel(first) && isVowel(last)) {
                c++;
            }
        }
        return c;
    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
