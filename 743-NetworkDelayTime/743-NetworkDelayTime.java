// Last updated: 31/12/2025, 4:07:59 pm
1class Solution {
2    class Pair{
3        int val;
4        List<Integer> path;
5        public Pair(int val,List<Integer> path){
6            this.val=val;
7            this.path=path;
8        }
9    }
10    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
11        List<Integer> ll=new ArrayList<>();
12        List<List<Integer>> ans=new ArrayList<>();
13        Queue<Pair> q = new LinkedList<>();
14		HashSet<Integer> visited = new HashSet<>();
15        ll.add(0);
16		q.add(new Pair(0,ll));
17        int des=graph.length-1;
18		while (!q.isEmpty()) {
19			Pair r = q.poll();
20			if (r.val == des) {
21                ans.add(new ArrayList<>(r.path));
22				continue;
23			}
24			for (int nbrs : graph[r.val]) {
25                    List<Integer> path=new ArrayList<>(r.path);
26                    path.add(nbrs);
27					q.add(new Pair(nbrs,path));
28				
29			}
30		}
31		return ans; 
32    }
33}