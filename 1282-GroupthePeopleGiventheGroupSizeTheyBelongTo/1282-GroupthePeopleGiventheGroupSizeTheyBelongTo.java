// Last updated: 24/1/2026, 6:10:40 pm
1class Solution {
2    public List<List<Integer>> groupThePeople(int[] groupSizes) {
3    List<List<Integer>> ans=new ArrayList<>();
4    Map<Integer, List<Integer>> mp = new HashMap<>();
5    for(int i = 0; i < groupSizes.length; i++) {
6    int size = groupSizes[i];  
7    if (!mp.containsKey(size)) {
8        mp.put(size, new ArrayList<>());
9    }
10    mp.get(size).add(i);
11   }
12    for(int i1:mp.keySet()){
13    List<Integer> ll=mp.get(i1);
14    int n = ll.size();
15     for (int i = 0; i < n; i += i1) {
16    ans.add(new ArrayList<>(ll.subList(i, i + i1)));
17     }
18   }
19   return ans; 
20    }
21}