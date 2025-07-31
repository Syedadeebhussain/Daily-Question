// Last updated: 31/7/2025, 2:23:09 pm
class Solution {
    public int minSteps(String s, String t) {
        int [] fres=new int[26];
          int [] fret=new int[26];
          for(int i=0;i<s.length();i++){
            fres[s.charAt(i)-'a']++;
          }
          for(int i1=0;i1<t.length();i1++){
            fret[t.charAt(i1)-'a']++;
          }
          int ans=0;
          for(int j=0;j<26;j++){
               
                ans+=Math.abs(fres[j]-fret[j]);
            
          }
          return ans;
    }
}