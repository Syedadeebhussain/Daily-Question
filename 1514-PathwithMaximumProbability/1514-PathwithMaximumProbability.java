// Last updated: 31/12/2025, 11:45:22 am
1class Solution {
2     class Pair {
3        int node;
4        double prob;
5        Pair(int n, double p) {
6            node = n;
7            prob = p;
8        }
9    }
10public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
11        Map<Integer, List<Pair>> graph = new HashMap<>();
12        for (int i = 0; i < n; i++) {
13            graph.put(i, new ArrayList<>());
14        }
15        for (int i = 0; i < edges.length; i++) {
16            int u = edges[i][0];
17            int v = edges[i][1];
18            double p = succProb[i];
19            graph.get(u).add(new Pair(v, p));
20            graph.get(v).add(new Pair(u, p));
21        }
22PriorityQueue<Pair> pq =new PriorityQueue<>((a, b) -> Double.compare(b.prob, a.prob));
23  double[] dist = new double[n];
24  dist[start] = 1.0;
25        pq.add(new Pair(start, 1.0));
26        while (!pq.isEmpty()) {
27            Pair curr = pq.poll();
28            int node = curr.node;
29            double prob = curr.prob;
30            if (node == end) return prob;
31            for (Pair next : graph.get(node)) {
32                double newProb = prob * next.prob;
33                if (newProb > dist[next.node]) {
34                    dist[next.node] = newProb;
35                    pq.add(new Pair(next.node, newProb));
36                }
37            }
38        }
39
40        return 0.0;
41    }
42}
43