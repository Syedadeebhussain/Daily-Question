// Last updated: 18/12/2025, 11:52:50 am
1class Solution {
2    class Pair {
3        int vtx;
4        int cost;
5        Pair(int vtx, int cost) {
6            this.vtx = vtx;
7            this.cost = cost;
8        }
9    }
10    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
11    HashMap<Integer,HashMap<Integer,Integer>> mp=new HashMap<>();
12    for(int i=0;i<n;i++){
13        mp.put(i,new HashMap<>());
14    }
15    for(int i=0;i<edges.length;i++){
16        mp.get(edges[i][0]).put(edges[i][1],edges[i][2]);
17         mp.get(edges[i][1]).put(edges[i][0],edges[i][2]);
18    }
19    int min=Integer.MAX_VALUE;
20    int ans=-1;
21    for(int src:mp.keySet()){
22        
23     HashSet<Integer> visited=new HashSet<>();
24     PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.cost-b.cost);
25         pq.add(new Pair(src,0));
26         int c=0;
27    while (!pq.isEmpty()) {
28    Pair rp = pq.poll();
29    if (visited.contains(rp.vtx)) continue;
30         visited.add(rp.vtx);
31         if (rp.vtx != src) c++;
32           for (int nbr : mp.get(rp.vtx).keySet()) {
33                    int newCost = rp.cost + mp.get(rp.vtx).get(nbr);
34                    if (!visited.contains(nbr) && newCost <= distanceThreshold) {
35                        pq.add(new Pair(nbr, newCost));
36                    }
37                }
38        } 
39        if(c<=min){
40            min=c;
41            ans=src;
42        }
43
44     }
45   return ans;
46    }
47}