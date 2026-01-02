// Last updated: 2/1/2026, 10:46:34 am
1class Solution {
2    public int edgeScore(int[] edges) {
3    HashMap<Integer,List<Integer>> mp=new HashMap<>();
4    for(int i=0;i<edges.length;i++){
5     mp.put(i,new ArrayList<>());
6    }
7    for(int i=0;i<edges.length;i++){
8        mp.get(edges[i]).add(i);
9    }
10    int ans=0;
11    long max=Long.MIN_VALUE;
12    for(int key:mp.keySet()){
13        if(mp.get(key).size()!=0){
14            long sum=0;
15            for(int i:mp.get(key)){
16                sum+=i;
17            }
18            if(sum>max){
19                max=sum;
20               ans=key;
21            }
22
23        }
24    }
25    return ans;
26    }
27}