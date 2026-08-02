// Last updated: 2/8/2026, 12:47:24 pm
1class Solution {
2    public int countValidPrefixes(String s) {
3        int c1=0;
4        int c2=0;
5        int c=0;
6        for (int i=0;i<s.length();i++) {
7            if (s.charAt(i)=='0'){
8                c1++;
9            }else{
10                c2++;
11            }
12            if (Math.abs(c1-c2)<=1)
13                c++;
14        }
15        return c;
16    }
17}