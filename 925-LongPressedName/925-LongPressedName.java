// Last updated: 21/12/2025, 11:37:07 am
1class Solution {
2    public boolean isLongPressedName(String s, String t) {
3     if(s.length()>t.length()) return false;
4     int i=0,j=0;
5     while(i<s.length() && j<t.length()){
6        if(s.charAt(i)==t.charAt(j)){
7            i++;
8            j++;
9        }
10        else if(i>0 && t.charAt(j)==s.charAt(i-1)){
11            j++;
12        }
13        else{
14            return false;
15        }
16     }
17     while(j<t.length()){
18        if(t.charAt(j)!=s.charAt(i-1)) return false;
19            j++;
20     }   
21     return i==s.length(); 
22     // for eg aabbcc
23        //  typed aaabbb(j bahar nikal jae but i bahar na nikle therefore we are checking this last condition)
24    }
25}