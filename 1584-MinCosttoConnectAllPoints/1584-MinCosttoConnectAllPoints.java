// Last updated: 18/12/2025, 12:09:02 pm
1class Solution {
2    class Pair {
3        int vtx;
4        int cost;
5        Pair(int vtx, int cost) {
6            this.vtx = vtx;
7            this.cost = cost;
8        }
9    }
10    public int minCostConnectPoints(int[][] points) {
11HashMap<Integer, HashMap<Integer, Integer>> mp = new HashMap<>();
12for (int i = 0; i < points.length; i++) {
13    mp.put(i, new HashMap<>());
14}
15for (int i = 0; i < points.length; i++) {
16    for (int j = i + 1; j < points.length; j++) {
17        int dist = Math.abs(points[i][0] - points[j][0])+ Math.abs(points[i][1] - points[j][1]);
18        mp.get(i).put(j, dist);
19        mp.get(j).put(i, dist);
20    }
21}
22     HashSet<Integer> visited=new HashSet<>();
23     PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.cost-b.cost);
24         pq.add(new Pair(0,0));
25    int ans=0;
26    while (!pq.isEmpty()) {
27    Pair rp = pq.poll();
28    if (visited.contains(rp.vtx)) continue;
29         visited.add(rp.vtx);
30         ans+=rp.cost;
31           for (int nbr : mp.get(rp.vtx).keySet()) {
32                    int newCost =  mp.get(rp.vtx).get(nbr);
33                    if (!visited.contains(nbr)) {
34                        pq.add(new Pair(nbr, newCost));
35                    }
36                }
37        } 
38return ans;
39    }
40}