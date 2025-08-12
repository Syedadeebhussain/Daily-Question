// Last updated: 12/8/2025, 9:09:00 pm
class Solution {
    public char findTheDifference(String s, String t) {
        
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            if (!freq.containsKey(ch) || freq.get(ch) == 0) {
                return ch; 
            }
            freq.put(ch, freq.get(ch) - 1); 
        }

        return ' '; 
    }
}
