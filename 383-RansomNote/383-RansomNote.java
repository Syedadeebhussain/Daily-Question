// Last updated: 27/8/2025, 11:57:44 am
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
         int[] count = new int[26];
         for(char c:magazine.toCharArray()){
            count[c-'a']++;
         }
         for(char c:ransomNote.toCharArray()){
            if(count[c-'a']==0){
                return false;
            }
            count[c-'a']--;
         }return true;
    }
}