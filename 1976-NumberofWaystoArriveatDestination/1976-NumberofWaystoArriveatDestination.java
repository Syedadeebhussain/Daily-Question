// Last updated: 9/8/2026, 12:04:51 am
1class Solution {
2    int MOD = 1000000007;
3    public int countPaths(int n, int[][] roads) {
4        List<List<long[]>> graph = new ArrayList<>();
5        for (int i = 0; i < n; i++) {
6            graph.add(new ArrayList<>());
7        }
8        for (int[] road : roads) {
9            int u = road[0];
10            int v = road[1];
11            int time = road[2];
12            graph.get(u).add(new long[]{v, time});
13            graph.get(v).add(new long[]{u, time});
14        }
15        long[] dist = new long[n];
16        Arrays.fill(dist, Long.MAX_VALUE);
17        dist[0] = 0;
18        int[] count = new int[n];
19        count[0] = 1;
20        PriorityQueue<long[]> pq =new PriorityQueue<>((a, b) -> Long.compare(a[1], b[1]));
21        pq.add(new long[]{0, 0});
22        while (!pq.isEmpty()) {
23            long[] curr = pq.poll();
24            int node = (int) curr[0];
25            long time = curr[1];
26            if (time > dist[node])
27                continue;
28            for (long[] edge : graph.get(node)) {
29                int next = (int) edge[0];
30                long weight = edge[1];
31                long newTime = time + weight;
32                if (newTime < dist[next]) {
33                    dist[next] = newTime;
34                    count[next] = count[node];
35                    pq.add(new long[]{next,newTime});
36                }
37                else if (newTime == dist[next]){
38                    count[next]=(count[next] + count[node]) % MOD;
39                }
40            }
41        }
42        return count[n-1];
43    }
44}