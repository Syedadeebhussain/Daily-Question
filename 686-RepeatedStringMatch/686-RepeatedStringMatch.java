// Last updated: 20/12/2025, 10:42:09 pm
1class Solution {
2    public int repeatedStringMatch(String a, String b) {
3       String s=a;
4       int i=1;
5       while(s.length()<b.length()){
6         s+=a;
7         i++;
8       }
9       if(s.contains(b)){
10        return i;
11       }
12        s += a;
13        i++;
14        if (s.contains(b)) return i;
15        return -1;
16    }
17}