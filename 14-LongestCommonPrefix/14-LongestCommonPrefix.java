// Last updated: 12/4/2026, 10:03:07 pm
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        Arrays.sort(strs);
4        for(int i=0;i<strs.length;i++){
5        System.out.println(strs[i]);
6        }
7        String a=strs[0];
8        String b=strs[strs.length-1];
9        StringBuilder sb=new StringBuilder();
10        for(int i=0;i<Math.min(a.length(),b.length());i++){
11          if(a.charAt(i)==b.charAt(i)){
12            sb.append(a.charAt(i));
13          }else{
14            return sb.toString();
15          }
16        } 
17        return sb.toString();
18        
19    }
20}