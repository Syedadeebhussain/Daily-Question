// Last updated: 31/7/2025, 2:23:05 pm
class Solution {
    public int percentageLetter(String s, char letter) {
        int [] freq=new int [26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int len=s.length();
        int freq1 = freq[letter - 'a'];
        int percentage = (freq1 * 100) / len;
        return percentage;
    }
}