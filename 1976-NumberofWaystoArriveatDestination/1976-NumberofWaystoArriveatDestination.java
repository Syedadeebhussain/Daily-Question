// Last updated: 28/2/2026, 12:14:41 pm
1import java.util.*;
2
3class Solution {
4    public int countPaths(int n, int[][] roads) {
5        int mod = 1_000_000_007;
6        Map<Integer, HashMap<Integer, Integer>> graph = new HashMap<>();
7        for (int i = 0; i < n; i++) {
8            graph.put(i, new HashMap<>());
9        }
10        for (int[] r : roads) {
11            int u = r[0];
12            int v = r[1];
13            int wt = r[2];
14            graph.get(u).put(v, wt);
15            graph.get(v).put(u, wt);
16        }
17        long[] dist = new long[n];
18        Arrays.fill(dist, Long.MAX_VALUE);
19        int[] ways = new int[n];
20        dist[0] = 0;
21        ways[0] = 1;
22        PriorityQueue<long[]> pq =
23                new PriorityQueue<>((a, b) -> Long.compare(a[1], b[1]));
24        pq.add(new long[]{0, 0});
25        while (!pq.isEmpty()) {
26            long[] cur = pq.poll();
27            int node = (int) cur[0];
28            long cost = cur[1];
29            if(node==n-1) return ways[n-1];
30            if (cost > dist[node]) continue;
31            for (int nbr:graph.get(node).keySet()) {
32                int wt = graph.get(node).get(nbr);
33                long newCost = cost + wt;
34                if (newCost < dist[nbr]) {
35                    dist[nbr] = newCost;
36                    ways[nbr] = ways[node];
37                    pq.add(new long[]{nbr, newCost});
38                } 
39                else if (newCost == dist[nbr]) {
40                    ways[nbr] = (ways[nbr] + ways[node]) % mod;
41                }
42            }
43        }
44
45        return 0;
46    }
47}