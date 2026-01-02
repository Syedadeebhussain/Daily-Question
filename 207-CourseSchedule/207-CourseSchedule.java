// Last updated: 2/1/2026, 10:25:56 am
1class Solution {
2    private List<List<Integer>> adj;
3    public boolean canFinish(int numCourses, int[][] prerequisites) {
4        adj = new ArrayList<>();
5        for (int i = 0; i < numCourses; i++) {
6            adj.add(new ArrayList<>());
7        }
8        for (int[] p : prerequisites) {
9            adj.get(p[1]).add(p[0]);
10        }
11        return topological(numCourses);
12    }
13    public int[] indegree(int n) {
14        int[] in = new int[n];
15        for (int u = 0; u < n; u++) {
16            for (int v : adj.get(u)) {
17                in[v]++;
18            }
19        }
20        return in;
21    }
22    public boolean topological(int n) {
23        Queue<Integer> q = new LinkedList<>();
24        int[] in = indegree(n);
25        for (int i = 0; i < n; i++) {
26            if (in[i] == 0) {
27                q.add(i);
28            }
29        }
30        int count = 0;
31        while (!q.isEmpty()) {
32            int node = q.poll();
33            count++;
34            for (int nbr : adj.get(node)) {
35                in[nbr]--;
36                if (in[nbr] == 0) {
37                    q.add(nbr);
38                }
39            }
40        }
41        return count == n;
42    }
43}
44