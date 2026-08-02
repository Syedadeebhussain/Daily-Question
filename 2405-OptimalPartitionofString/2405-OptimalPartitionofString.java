// Last updated: 2/8/2026, 11:43:30 am
1class Solution {
2    public int partitionString(String s) {
3       HashMap<Character,Integer> mp=new HashMap<>();
4       int c=0;
5        for(int i=0;i<s.length();i++){
6            char ch=s.charAt(i);
7            if(!mp.containsKey(ch)){
8                mp.put(ch,1);
9            }
10            else{
11                c++;
12                mp.clear();
13                mp.put(ch,1);
14            }
15
16        }
17        return c+1;
18    }
19}