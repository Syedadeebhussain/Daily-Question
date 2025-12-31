// Last updated: 31/12/2025, 3:08:31 pm
1class Solution {
2    public int networkDelayTime(int[][] times, int n, int k) {
3        List<List<Pair>> adj = new ArrayList<>();
4        for (int i = 0; i <= n; i++) 
5        {
6            adj.add(new ArrayList<>());
7        }
8        for (int[] edge : times) {
9            int u = edge[0], v = edge[1], wt = edge[2];
10            adj.get(u).add(new Pair(v, wt));
11        }
12        int[] dist = new int[n + 1];
13        Arrays.fill(dist, Integer.MAX_VALUE);
14        dist[k] = 0;
15        TreeSet<Pair> pq = new TreeSet<>( (a,b)->a.dist == b.dist ? a.node - b.node : a.dist - b.dist);
16        pq.add(new Pair(k, 0));
17        while (!pq.isEmpty()) {
18            Pair curr = pq.pollFirst();
19            int u = curr.node;
20            for (Pair P : adj.get(u)) {
21                int v = P.node;
22                int wt = P.dist;
23                if (dist[u] + wt < dist[v]) {
24                    // pq.remove(new Pair(v,dist[v]));
25                    dist[v] = dist[u] + wt;
26                    pq.add(new Pair(v, dist[v]));
27                }
28            }
29        }
30        int max = 0;
31        for (int i = 1; i <= n; i++) {
32            if (dist[i] == Integer.MAX_VALUE) return -1;
33            max = Math.max(max, dist[i]);
34        }
35        return max;
36    }
37}
38
39// Helper class for (node, distance)
40class Pair {
41    int node, dist;
42    Pair(int node, int dist) {
43        this.node = node;
44        this.dist = dist;
45    }
46}
47