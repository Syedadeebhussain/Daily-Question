// Last updated: 6/1/2026, 1:03:50 pm
1class Solution {
2    public int minimumJumps(int[] forbidden, int a, int b, int x) {
3        return bfs(forbidden, a, b, x);
4    }
5    public int bfs(int[] forbidden, int a, int b, int x){
6        Set<Integer> forbid = new HashSet<>();
7        for (int f : forbidden) forbid.add(f);
8        Queue<int[]> q=new LinkedList<>();
9        int limit=6000;
10        boolean[][] visited = new boolean[6000][2];
11        q.add(new int []{0,0,0});// pos,laststate,jumps
12        visited[0][0] = true;
13        while(!q.isEmpty()){
14            int [] curr=q.poll();
15            int pos=curr[0];
16            int state=curr[1];
17            int jumps=curr[2];
18
19            if (pos == x) return jumps;
20
21    // Even if a position is already visited, we may still go there again IF it is visited with a different last-move state.
22            int forward=pos+a;
23            if(forward<limit && !forbid.contains(forward) && !visited[forward][0]){
24                visited[forward][0]=true;
25               q.add(new int[]{forward, 0, jumps + 1});
26            }
27            int backward=pos-b;
28            if(state == 0 && backward >= 0 && !forbid.contains(backward) && !visited[backward][1]){
29                visited[backward][1]=true;
30               q.add(new int[]{backward, 1, jumps + 1});
31            }
32        }
33        return -1;
34    }
35}