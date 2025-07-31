// Last updated: 31/7/2025, 2:23:41 pm
class Solution {
    public boolean areOccurrencesEqual(String s) {
    int [] freq=new int[26];
    for(int i=0;i<s.length();i++){
        freq[s.charAt(i)-'a']++;
    }
    int c=freq[s.charAt(0)-'a'];
    for(int i=0;i<s.length();i++){
        if(freq[s.charAt(i)-'a']!=c){
            return false;
        }
    }
    return true;
    }
}