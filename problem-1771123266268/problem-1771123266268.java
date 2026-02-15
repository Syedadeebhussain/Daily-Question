// Last updated: 15/2/2026, 8:11:06 am
1class Solution {
2    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
3        List<Integer> ll=new ArrayList<>();
4     Map<Integer,Integer> mp=new TreeMap<>();
5        for(int i:bulbs){
6            if(mp.containsKey(i)){
7                mp.put(i,mp.getOrDefault(i,0)+1);
8            }
9            else{
10                mp.put(i,1);
11            }
12        }
13        for(int i:mp.keySet()){
14            if(mp.get(i)%2==1){
15                ll.add(i);
16            }
17        }
18        return ll;
19    }
20}