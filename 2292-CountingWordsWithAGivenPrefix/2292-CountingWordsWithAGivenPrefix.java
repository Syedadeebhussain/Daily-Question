// Last updated: 31/7/2025, 2:23:10 pm
class Solution {
    public int prefixCount(String[] words, String pref) {
  int len=pref.length();
    int c=0;
    for(int i=0;i<words.length;i++){
         if(words[i].length()>=len){
         if(words[i].substring(0,len).equals(pref)){
            c++;
         }
        }
       
    }   
   return c;
    }
}