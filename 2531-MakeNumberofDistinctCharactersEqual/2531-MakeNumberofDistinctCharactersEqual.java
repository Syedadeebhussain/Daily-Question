// Last updated: 23/1/2026, 9:58:24 pm
1class Solution {
2    
3    public void insertAndRemove(Map<Character, Integer> mp, char toInsert, char toRemove){
4        mp.put(toInsert, mp.getOrDefault(toInsert, 0) + 1);
5        mp.put(toRemove, mp.getOrDefault(toRemove, 0) - 1);
6        if(mp.get(toRemove)==0) mp.remove(toRemove);
7    }    
8    public boolean isItPossible(String word1, String word2) {
9        Map<Character, Integer> mp1 = new HashMap<>();
10        Map<Character, Integer> mp2 = new HashMap<>();
11        for (char w1: word1.toCharArray()) {   
12            mp1.put(w1, mp1.getOrDefault(w1, 0) + 1);
13        }
14        for (char w2: word2.toCharArray()) {  
15            mp2.put(w2, mp2.getOrDefault(w2, 0) + 1);
16        }
17        for(char c1='a'; c1<='z'; c1++){
18            for(char c2='a'; c2<='z'; c2++){
19                if(!mp1.containsKey(c1) || !mp2.containsKey(c2)) continue; 
20                insertAndRemove(mp1, c2, c1);
21                insertAndRemove(mp2, c1, c2);
22                if(mp1.size()==mp2.size()) return true;
23                insertAndRemove(mp1, c1, c2); 
24                insertAndRemove(mp2, c2, c1); 
25            }
26        }
27        return false;
28    }
29}