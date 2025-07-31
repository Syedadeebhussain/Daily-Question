// Last updated: 31/7/2025, 2:22:58 pm
class Solution {
    public char repeatedCharacter(String s) {
      boolean[] visited=new boolean[26];
      for(int i=0;i<s.length();i++){
        if(visited[s.charAt(i)-'a']==true){
            return s.charAt(i);
        }
        else{
            visited[s.charAt(i)-'a']=true;
        }
      }
      return 'a';

    }
}