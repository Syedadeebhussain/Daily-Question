// Last updated: 8/1/2026, 7:21:03 pm
1class Solution {
2    public List<Integer> eventualSafeNodes(int[][] graphs) {
3    int n=graphs.length;
4    List<Integer> ll = new ArrayList<>();
5    List<List<Integer>> rev = new ArrayList<>();
6    for (int i = 0; i < n; i++) {
7        rev.add(new ArrayList<>());
8    }
9    for (int u = 0; u < n; u++) {
10        for (int v : graphs[u]) {
11            rev.get(v).add(u);
12        }
13    }
14    int[] indeg = new int[n];
15    for (int i = 0; i < n; i++) {
16        for(int j:rev.get(i)){
17            indeg[j]++;
18        }
19    }
20    Queue<Integer> q = new LinkedList<>();
21    for (int i = 0; i < n; i++) {
22        if (indeg[i] == 0) {
23            System.out.println(i);
24            q.add(i);
25        }
26    }
27    while (!q.isEmpty()) {
28        int u = q.poll();
29        ll.add(u);
30        for (int v : rev.get(u)) {
31            indeg[v]--;
32            if (indeg[v] == 0) {
33                q.add(v);
34            }
35        }
36    }
37    Collections.sort(ll);
38    return ll;
39 }
40}