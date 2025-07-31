// Last updated: 31/7/2025, 2:24:17 pm
class Solution {
    public int countConsistentStrings(String allowed, String[] words)
    {
        int c=0;
        for(int i=0;i<words.length;i++){
          if(check(words[i],allowed)){
            c++;
          }  
        }
        return c;
    }
    public boolean check(String s,String all){
        String regex = "[" + all + "]+";
        if (!s.matches(regex)){
            return false;
        }
        return true;
    }
}