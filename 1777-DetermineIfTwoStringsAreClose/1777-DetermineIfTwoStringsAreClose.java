// Last updated: 31/7/2025, 2:24:20 pm
class Solution {
    public boolean closeStrings(String s, String t) {
       if(s.length()!=t.length()) return false;
       if(s.equals(t)) return true;
           int [] fres=new int[26];
          int [] fret=new int[26];
          for(int i=0;i<s.length();i++){
            fres[s.charAt(i)-'a']++;
          }
          for(int i1=0;i1<t.length();i1++){
            fret[t.charAt(i1)-'a']++;
          }
          for (int i = 0; i < 26; i++) {
            if((fres[i] != 0 && fret[i] == 0) || (fres[i] == 0 && fret[i] != 0)) {
                return false;
            }
        }
         Arrays.sort(fres);
         Arrays.sort(fret);
        return  Arrays.equals(fres, fret);
    }
}