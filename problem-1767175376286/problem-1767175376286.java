// Last updated: 31/12/2025, 3:32:56 pm
1class Solution {
2    public boolean validPath(int n, int[][] edges, int source, int destination) {
3        Map<Integer, List<Integer>> graph = new HashMap<>();
4        for (int[] edge : edges) {
5            int u = edge[0];
6            int v = edge[1];
7            if (!graph.containsKey(u)) graph.put(u, new ArrayList<>());
8            if (!graph.containsKey(v)) graph.put(v, new ArrayList<>());
9            graph.get(u).add(v);
10            graph.get(v).add(u);
11        }
12       Stack<Integer> st=new Stack<>();
13       HashSet<Integer> visited=new HashSet<>();
14       st.add(source);
15       while(!st.isEmpty()){
16        int r=st.pop();
17        if(visited.contains(r)) continue;
18        visited.add(r);
19        if(r==destination) return true;
20        for(int nbrs:graph.get(r)){
21            if(!visited.contains(nbrs)){
22                st.push(nbrs);
23            }
24        }
25       }
26       return false;
27    }}