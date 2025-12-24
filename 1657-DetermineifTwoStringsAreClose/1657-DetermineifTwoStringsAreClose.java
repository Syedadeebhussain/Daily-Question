// Last updated: 24/12/2025, 11:27:59 am
1class Solution {
2    public boolean closeStrings(String s, String t) {
3       if(s.length()!=t.length()) return false;
4       if(s.equals(t)) return true;
5           int [] fres=new int[26];
6          int [] fret=new int[26];
7          for(int i=0;i<s.length();i++){
8            fres[s.charAt(i)-'a']++;
9          }
10          for(int i1=0;i1<t.length();i1++){
11            fret[t.charAt(i1)-'a']++;
12          }
13          for (int i = 0; i < 26; i++) {
14            if((fres[i] != 0 && fret[i] == 0) || (fres[i] == 0 && fret[i] != 0)) {
15                return false;
16            }
17        }
18         Arrays.sort(fres);
19         Arrays.sort(fret);
20        return  Arrays.equals(fres, fret);
21    }
22}