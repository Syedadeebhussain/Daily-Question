// Last updated: 19/12/2025, 10:42:53 pm
1class Solution {
2    public boolean isEscapePossible(int[][] blocked, int[] source, int[] target) {
3      Set<String> set = new HashSet<>();
4        for (int[] b : blocked) {
5            set.add(b[0] + "," + b[1]);
6        }
7     return bfs(source,target,set) && bfs(target,source,set);   
8    }
9    public boolean bfs(int[] start, int[] end, Set<String> blocked) {
10    int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
11    Queue<int[]> q = new LinkedList<>();
12    HashSet<String> visited = new HashSet<>();
13    q.add(start);
14    while(!q.isEmpty()&& visited.size()<= 20000){
15         int[] c = q.poll();
16        String key = c[0] + "," + c[1];
17        if (visited.contains(key)) {
18            continue;
19        }
20        visited.add(key);
21        if(c[0]==end[0] && c[1]==end[1]) return true;
22        for(int [] d:dirs){
23            int x=d[0]+c[0];
24            int y=d[1]+c[1];
25           String key1=x+","+y;
26         if(x>=0 && y>=0 && x<1000000 && y<1000000 && !blocked.contains(key1) && !visited.contains(key1)){
27            q.add(new int []{x,y});
28         }
29        }
30    }
31    return visited.size()>20000;
32
33}
34}