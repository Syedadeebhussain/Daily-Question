// Last updated: 31/12/2025, 2:47:23 pm
1import java.util.*;
2
3class Solution {
4    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
5        List<List<int[]>> adj = new ArrayList<>();
6        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
7        for (int[] f : flights) {
8            adj.get(f[0]).add(new int[]{f[1], f[2]});
9        }
10        Queue<int[]> q = new LinkedList<>();
11        q.offer(new int[]{0, src, 0});
12        int[] dist = new int[n];
13        Arrays.fill(dist, Integer.MAX_VALUE);
14        dist[src] = 0;
15        while (!q.isEmpty()) {
16            int[] cur = q.poll();
17            int stops = cur[0];
18            int node = cur[1];
19            int cost = cur[2];
20            if (stops > K) continue;
21            for (int[] edge : adj.get(node)) {
22                int next = edge[0];
23                int price = edge[1];
24                if (cost + price < dist[next]) {
25                    dist[next] = cost + price;
26                    q.offer(new int[]{stops + 1, next, cost + price});
27                }
28            }
29        }
30        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
31    }
32}
33