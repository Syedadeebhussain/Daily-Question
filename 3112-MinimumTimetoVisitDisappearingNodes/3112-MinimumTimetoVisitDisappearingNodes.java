// Last updated: 4/2/2026, 10:16:13 pm
1class Solution {
2    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
3        List<List<int[]>> graph = new ArrayList<>();
4        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
5        for (int[] e : edges) {
6            int u = e[0], v = e[1], w = e[2];
7            graph.get(u).add(new int[]{v, w});
8            graph.get(v).add(new int[]{u, w});
9        }
10        int[] dist = new int[n];
11        Arrays.fill(dist, Integer.MAX_VALUE);
12        PriorityQueue<int[]> pq = new PriorityQueue<>(
13            (a, b) -> Integer.compare(a[0], b[0])
14        );
15        if (0 >= disappear[0]) {
16            return new int[n]; 
17        }
18        dist[0] = 0;
19        pq.add(new int[]{0, 0});
20        while (!pq.isEmpty()) {
21            int[] curr = pq.poll();
22            int time = curr[0];
23            int node = curr[1];
24            if (time > dist[node]) continue;
25            for (int[] next : graph.get(node)) {
26                int nei = next[0];
27                int wt = next[1];
28                int newTime = time + wt;
29                if (newTime < disappear[nei] && newTime < dist[nei]) {
30                    dist[nei] = newTime;
31                    pq.add(new int[]{newTime, nei});
32                }
33            }
34        }
35        for (int i = 0; i < n; i++) {
36            if (dist[i] == Integer.MAX_VALUE) {
37                dist[i] = -1;
38            }
39        }
40        return dist;
41    }
42}
43