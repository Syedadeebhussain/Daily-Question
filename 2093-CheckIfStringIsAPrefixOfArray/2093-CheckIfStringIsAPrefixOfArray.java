// Last updated: 31/7/2025, 2:23:36 pm
class Solution {
    public boolean isPrefixString(String s, String[] words) {
    String w="";
    for(int i=0;i<words.length;i++){
     w+=words[i];
     if(w.equals(s)){
        return true;
    }
    }  
    return false;
    }
}