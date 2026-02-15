// Last updated: 15/2/2026, 8:45:15 am
1class Solution {
2    public int firstUniqueFreq(int[] nums) {
3    HashMap<Integer,Integer> mp=new LinkedHashMap<>();
4    for(int i:nums){
5        mp.put(i,mp.getOrDefault(i,0)+1);
6    }
7     HashMap<Integer,Integer> freq=new HashMap<>();
8     for(int i:mp.values()){
9         freq.put(i,freq.getOrDefault(i,0)+1);
10     }
11     for(int i:nums){
12         if(freq.get(mp.get(i))==1){
13             return i;
14         }
15     }
16        return -1;
17    }
18}