// Last updated: 22/12/2025, 10:36:01 am
1class Solution {
2    public String longestNiceSubstring(String s) {
3            String ans="";
4        for(int i=0;i<=s.length();i++){
5            for(int j=i+1;j<=s.length();j++){
6                String sub=s.substring(i,j);
7              if (Nice(sub) && sub.length() > ans.length()) {
8                    ans = sub;
9                }
10            }
11        }
12        return ans;
13    }
14    public boolean Nice(String s){
15        for(int i=0;i<s.length();i++){
16        if (Character.isUpperCase(s.charAt(i)) &&
17            !s.contains(String.valueOf(Character.toLowerCase(s.charAt(i))))) {
18            return false;
19        }
20        else if (Character.isLowerCase(s.charAt(i)) &&
21            !s.contains(String.valueOf(Character.toUpperCase(s.charAt(i))))) {
22            return false;
23        }
24        }
25        return true;
26    }
27}