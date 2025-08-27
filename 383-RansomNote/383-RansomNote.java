// Last updated: 27/8/2025, 11:55:59 am
class Solution {
    public boolean canConstruct(String s, String m) {

     HashMap<Character,Integer>mp=new HashMap<>();
     for(int i=0;i<m.length();i++){
        char c=m.charAt(i);
        if(mp.containsKey(c)){
            mp.put(c,mp.get(c)+1);
        }
        else{
             mp.put(c,1);
        }
     } 
     for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(!mp.containsKey(ch) || mp.get(ch)==0){
            return false;
        }
        else{
             mp.put(ch,mp.get(ch)-1);
        }
    } 
  return true;
    }
}