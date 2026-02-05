// Last updated: 5/2/2026, 3:53:57 pm
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        Arrays.sort(strs);
4        String a=strs[0];
5        String b=strs[strs.length-1];
6        StringBuilder sb=new StringBuilder();
7        for(int i=0;i<Math.min(a.length(),b.length());i++){
8          if(a.charAt(i)==b.charAt(i)){
9            sb.append(a.charAt(i));
10          }else{
11            return sb.toString();
12          }
13        } 
14        return sb.toString();
15    }
16}