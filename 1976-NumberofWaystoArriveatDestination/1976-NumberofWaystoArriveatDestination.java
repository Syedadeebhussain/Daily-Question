// Last updated: 4/1/2026, 11:59:34 am
1class Solution {
2    public int countPaths(int n, int[][] roads) {
3        HashMap<Integer, HashMap<Integer, Integer>> mp = new HashMap<>();
4        for (int i = 0; i < n; i++) {
5            mp.put(i, new HashMap<>());
6        }
7        int mod = 1_000_000_007;
8        for (int[] r : roads) {
9            int u = r[0];
10            int v = r[1];
11            int c = r[2];
12            mp.get(u).put(v, c);
13            mp.get(v).put(u, c);
14        }
15        long[] dist = new long[n];
16        Arrays.fill(dist, Long.MAX_VALUE);
17        int[] ct = new int[n];
18        dist[0] = 0;
19        ct[0] = 1;
20        PriorityQueue<long[]> pq =
21            new PriorityQueue<>((a, b) -> Long.compare(a[1], b[1]));
22        pq.add(new long[]{0, 0});
23        while (!pq.isEmpty()) {
24            long[] rm = pq.poll();
25            int node = (int) rm[0];
26            long cost = rm[1];
27            if (cost > dist[node]) continue;
28            for (int nbr : mp.get(node).keySet()) {
29                long newcost = cost + mp.get(node).get(nbr);
30                if (newcost < dist[nbr]) {
31                    dist[nbr] = newcost;
32                    ct[nbr] = ct[node];
33                    pq.add(new long[]{nbr, newcost});
34                } else if (newcost == dist[nbr]) {
35                    ct[nbr] = (ct[nbr] + ct[node]) % mod;
36                }
37            }
38        }
39        return ct[n - 1];
40    }
41}
42