// Last updated: 31/7/2025, 2:24:33 pm
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int c=0;
    String [] s=sentence.split(" ");
    for(int i=0;i<s.length;i++){
        if(s[i].contains(searchWord) && s[i].indexOf(searchWord)==0){
            return i+1;
        }
    }
    return -1;
    }
}