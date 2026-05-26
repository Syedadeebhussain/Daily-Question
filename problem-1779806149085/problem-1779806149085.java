// Last updated: 26/5/2026, 8:05:49 pm
1class Solution {
2    public int numberOfSpecialChars(String word) {
3        Set<Character> st1=new HashSet<>();
4        Set<Character> st2=new HashSet<>();
5       for(char ch:word.toCharArray()){
6            if(Character.isUpperCase(ch)){
7             st1.add(ch);
8            }
9            else{
10             st2.add(ch);
11            }
12       }
13       int c=0;
14       for(char ch:st1){
15        System.out.println(ch);
16        if(st2.contains(Character.toLowerCase(ch))){
17            
18            c++;
19        }
20       }
21       return c;
22    }
23}