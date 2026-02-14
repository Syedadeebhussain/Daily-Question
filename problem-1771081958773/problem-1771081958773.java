// Last updated: 14/2/2026, 8:42:38 pm
1class Solution {
2    public int prefixConnected(String[] words, int k) {
3     Map<String,Integer> mp=new HashMap<>();
4        for(String s:words){
5            if(s.length()<k) continue;
6            String st=s.substring(0,k);
7            if(mp.containsKey(st)){
8                mp.put(st,mp.getOrDefault(st,0)+1);
9            }
10            mp.put(st,mp.getOrDefault(st,0)+1);
11        }
12        int c=0;
13         for(String key:mp.keySet()){
14             if(mp.get(key)>=2){
15                 c++;
16             }
17         }
18        return c;
19    }
20}